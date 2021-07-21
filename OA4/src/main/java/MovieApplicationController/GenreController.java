package MovieApplicationController;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JLabel;
import javax.swing.JPanel;

import MovieApplication.Atlas;

import MovieApplicationModel.Genre;
import MovieApplicationModel.GenreSort;
import MovieApplicationModel.Production;

import MovieApplicationView.SortingFrame;

public class GenreController {
	private Atlas atlas;
	private SortingFrame genreFrame;
	private Set<Production> productions;
	private Set<Genre> sortedGenre;
	private MainFrameController mainFrameController = new MainFrameController();

	public GenreController(Atlas atlas, SortingFrame genreFrame) {
		this.atlas = atlas;
		this.genreFrame = genreFrame;
		atlas.sortingChoice(1); // choose NameSort when displaying productions
		initView();
	}

	public void initView() {
		productions = atlas.getProductions();
		// Sort genre by its name
		sortedGenre = new TreeSet<Genre>(new GenreSort());
		for (Genre g : atlas.getGenres()) {
			sortedGenre.add(g);
		}
		for (Genre g : sortedGenre) {
			addingGenreLabel(g); // add a new label with genre name on the frame
			for (Production p : productions) {
				for (Genre pg : p.getGenre()) {
					if (pg.getGenre().equals(g.getGenre())) {
						addingTitlePanel(p);// add a new panel with title and genre of the production on the frame
					}
				}
			}
		}

	}

	public void addingGenreLabel(Genre g) {
		JLabel text = new JLabel(g.getGenre());
		genreFrame.getPanel().add(text);
	}

	public void addingTitlePanel(Production p) {
		JPanel panel = new JPanel();

		JLabel text = new JLabel(p.getTitle());
		text.setForeground(Color.BLUE); // set font color blue
		text.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				mainFrameController.openDetails(p);// give the label onclick event with method openDetails(p) from
													// mainFrameController
			}
		});
		panel.add(text);

		JLabel genreText = new JLabel(String.valueOf(p.getYear()));
		panel.add(genreText);

		genreFrame.getPanel().add(panel);
	}
}
