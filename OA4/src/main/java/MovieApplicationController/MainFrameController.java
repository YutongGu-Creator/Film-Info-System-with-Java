package MovieApplicationController;

import java.util.TreeSet;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JLabel;

import MovieApplication.Atlas;
import MovieApplicationModel.Film;
import MovieApplicationModel.Genre;
import MovieApplicationModel.Production;
import MovieApplicationModel.Profile;
import MovieApplicationModel.Tvseries;
import MovieApplicationView.AddNewFrame;
import MovieApplicationView.MainFrame;
import MovieApplicationView.ProfileFrame;
import MovieApplicationView.SortingFrame;

public class MainFrameController {
	private Atlas atlas;
	private MainFrame mainFrame;
	private ProfileFrame profileFrame;
	private AddNewFrame addNewFrame;
	private SortingFrame sortingFrame;
	private Genre genre;
	private Set<JLabel> labels;
	private Set<Production> TP;

	public MainFrameController() {
	}

	public MainFrameController(Atlas atlas, MainFrame mainFrame) {
		this.atlas = atlas;
		this.mainFrame = mainFrame;
		atlas.sortingChoice(1);
		// set the next user in profiles set as the default user
		initView(atlas.getProfiles().iterator().next());
	}

	public void initView(Profile user) {
		mainFrame.getUserProfile().setText("User Profile: " + user.getName());
		genre = user.getPreferredGenre();

		// put all the films and Tvseries of that user's preference together
		TP = new TreeSet<Production>();
		for (Film f : atlas.getFilms()) {
			if (f.getGenre().contains(genre)) {
				TP.add(f);
			}
		}

		for (Tvseries t : atlas.getTvseries()) {
			if (t.getGenre().contains(genre)) {
				TP.add(t);
			}
		}

//		JLabel[] title = new JLabel[TP.size()];
		labels = new HashSet<JLabel>();

		int y = 150;
//		int i = 0;
		for (Production p : TP) {
			JLabel text = new JLabel(p.getTitle());
			text.setBounds(350, y, 300, 40);
			text.setForeground(Color.BLUE);
			text.addMouseListener(new MouseAdapter() {// add onclick event with lambda
				public void mouseClicked(MouseEvent e) {
//					System.out.println(p.getTitle());
					openDetails(p);
				}
			});
			labels.add(text);
			mainFrame.getFrame().add(text);

			JLabel year = new JLabel(String.valueOf(p.getYear()));
			year.setBounds(600, y, 50, 40);
			mainFrame.getFrame().add(year);
			labels.add(year);

			JLabel genre = new JLabel(p.showGenre());
			genre.setBounds(800, y, 200, 40);
			mainFrame.getFrame().add(genre);
			labels.add(genre);

			y += 50;
//			i++;
		}

//		while (TP.size() <= 5) {
//			Production p = new Production();
//			TP.add(p);
//		}
//		mainFrame.getTitle1().setText(TP.get(0).getTitle());
//		mainFrame.getTitle2().setText(TP.get(1).getTitle());
//		mainFrame.getTitle3().setText(TP.get(2).getTitle());
//		mainFrame.getTitle4().setText(TP.get(3).getTitle());
//		mainFrame.getTitle5().setText(TP.get(4).getTitle());
//		mainFrame.getYear1().setText(TP.get(0).getYear());
//		mainFrame.getYear2().setText(TP.get(1).getYear());
//		mainFrame.getYear3().setText(TP.get(2).getYear());
//		mainFrame.getYear4().setText(TP.get(3).getYear());
//		mainFrame.getYear5().setText(TP.get(4).getYear());
//		mainFrame.getMovieGenre1().setText(TP.get(0).showGenre());
//		mainFrame.getMovieGenre2().setText(TP.get(1).showGenre());
//		mainFrame.getMovieGenre3().setText(TP.get(2).showGenre());
//		mainFrame.getMovieGenre4().setText(TP.get(3).showGenre());
//		mainFrame.getMovieGenre5().setText(TP.get(4).showGenre());
	}

	public void initController() {
		// event handler for the four buttons on the left
		mainFrame.getBtnNewButton().addActionListener(e -> openProfile());
		mainFrame.getBtnAddNew().addActionListener(e -> openAddNew());
		mainFrame.getBtnListByYear().addActionListener(e -> openListByYear());
		mainFrame.getBtnListByGenre().addActionListener(e -> openListByGenre());
	}

	private void openProfile() {
		profileFrame = new ProfileFrame();
		ProfileController profileController = new ProfileController(atlas, profileFrame, this);
	}

	private void openAddNew() {
		addNewFrame = new AddNewFrame();
		AddNewController addNewController = new AddNewController(atlas, addNewFrame);
	}

	private void openListByYear() {
		sortingFrame = new SortingFrame();
		YearController YearController = new YearController(atlas, sortingFrame);
	}

	private void openListByGenre() {
		sortingFrame = new SortingFrame();
		GenreController genreController = new GenreController(atlas, sortingFrame);
	}

	// use AddNewFrame with disabled fields to show production details
	public void openDetails(Production p) {
		AddNewFrame showFrame = new AddNewFrame();
		showFrame.gettTitle().setText(p.getTitle());
		showFrame.gettTitle().setEditable(false);// disable the text field

		showFrame.getTdescription().setText(p.getDescription());
		showFrame.getTdescription().setEditable(false);

		showFrame.getTyear().setText(String.valueOf(p.getYear()));
		showFrame.getTyear().setEditable(false);

		showFrame.getTgenre().setText(p.showGenre());
		showFrame.getTgenre().setEditable(false);

		// get its director when it's a film
		if (p instanceof Film) {
			showFrame.getTdirector().setText(((Film) p).getDirector().getName());
			showFrame.getTdirector().setEditable(false);
		}
		// get its creator when it's a Tvseries and tick tvseries checkbox
		if (p instanceof Tvseries) {
			showFrame.getTdirector().setText(((Tvseries) p).getCreator().getName());
			showFrame.getTdirector().setEditable(false);
			showFrame.getTtv().setSelected(true);
			showFrame.getTtv().setFocusable(false);

		}

		showFrame.getTcast().setText(p.showCast());
		showFrame.getTcast().setEditable(false);

		// change save button to back button and its behaviour to close the frame
		showFrame.getBtnSave().setText("Back");
		showFrame.getBtnSave().addActionListener(e -> showFrame.getFrame().dispose());
	}

	public MainFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	public Set<JLabel> getLabels() {
		return labels;
	}

	public void setLabels(Set<JLabel> labels) {
		this.labels = labels;
	}

	public ProfileFrame getProfileFrame() {
		return profileFrame;
	}

	public void setProfileFrame(ProfileFrame profileFrame) {
		this.profileFrame = profileFrame;
	}

}
