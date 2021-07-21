package MovieApplicationController;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Set;

import javax.swing.JLabel;
import javax.swing.JPanel;

import MovieApplication.Atlas;

import MovieApplicationModel.Production;

import MovieApplicationView.SortingFrame;

public class YearController {
	private Atlas atlas;
	private SortingFrame yearFrame;
	private Set<Production> productions;
	private MainFrameController mainFrameController = new MainFrameController();

	public YearController(Atlas atlas, SortingFrame yearFrame) {
		this.atlas = atlas;
		this.yearFrame = yearFrame;
		atlas.sortingChoice(2); // choose YearSort when displaying productions
		initView();
	}

	public YearController() {
	}

	public void initView() {
		productions = atlas.getProductions();

		for (Production p : productions) {
			int i = p.getYear();
			addingYearLabel(i); // add a new label with year number on the frame

			for (Production pr : productions) {
				if (pr.getYear() == i) {
					addingTitlePanel(pr); // add a new panel with title and genre of the production on the frame
				}
			}
		}

	}

	public void addingYearLabel(int i) {
		JLabel text = new JLabel(String.valueOf(i)); // convert year's value from int to string
		yearFrame.getPanel().add(text);
	}

	public void addingTitlePanel(Production p) {
		JPanel panel = new JPanel();

		JLabel text = new JLabel(p.getTitle());
		text.setForeground(Color.BLUE); // set font color blue
		text.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				mainFrameController.openDetails(p); // give the label onclick event with method openDetails(p) from
													// mainFrameController
			}
		});
		panel.add(text);

		JLabel genreText = new JLabel(p.showGenre());
		panel.add(genreText);

		yearFrame.getPanel().add(panel);
	}
}
