package MovieApplicationController;

import java.util.Set;
import java.util.TreeSet;

import javax.swing.JOptionPane;

import MovieApplication.Atlas;

import MovieApplicationModel.Genre;
import MovieApplicationModel.People;
import MovieApplicationModel.Production;
import MovieApplicationModel.ProductionFactory;

import MovieApplicationView.AddNewFrame;

public class AddNewController {
	private Atlas atlas;
	private AddNewFrame addNewFrame;
	private Production production;
	private People directPeople;
	private People castPeople;
	private ProductionFactory productionFactory;
	private Genre genre;
	private Set<Genre> genres;
	private Set<People> casts;

	public AddNewController(Atlas atlas, AddNewFrame addNewFrame) {
		this.atlas = atlas;
		this.addNewFrame = addNewFrame;
		initController();
	}

	public void initController() {
		addNewFrame.getBtnSave().addActionListener(e -> saveProduction());
	}

	public void saveProduction() {
		try {
			String text = addNewFrame.gettTitle().getText();
			String description = addNewFrame.getTdescription().getText();
			int year = Integer.valueOf(addNewFrame.getTyear().getText());
			String genreName = addNewFrame.getTgenre().getText();
			String director = addNewFrame.getTdirector().getText();
			String cast = addNewFrame.getTcast().getText();
			Boolean TV = addNewFrame.getTtv().isSelected();

			// use "," to part when there are multiple genres
			String[] genreNames = genreName.split(",");
			genres = checkExistGenre(genreNames);

//			for(String g : genreNames) {System.out.println(g);}

			directPeople = checkExsistDirector(director);

			String[] castNames = cast.split(",");
			casts = checkExsistCast(castNames);

			// get the factory to make this new product for us
			productionFactory = new ProductionFactory();
			production = productionFactory.makeProduction(atlas, TV, text, description, year, genres, directPeople,
					casts);

			addNewFrame.getFrame().dispose();
			JOptionPane.showMessageDialog(null, "Successfully updated!", "Success", JOptionPane.INFORMATION_MESSAGE);
		} catch (NumberFormatException e) { // catch exception if some fields are not correct and alert user
			JOptionPane.showMessageDialog(null, "Please fill all fields correctly!", "Error",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	public Set<Genre> checkExistGenre(String[] genreNames) {
		Set<Genre> genreSet = new TreeSet<Genre>();
		for (String g : genreNames) {
			for (Genre gn : atlas.getGenres()) {
//				;
				if (g == gn.getGenre()) { // if genre entered already exist then just assign that genre object
					genreSet.add(gn);
				}
			}
			genre = new Genre(atlas.getGenres().size() + 1, g); // When this is put under if above in a else then
																// concurrentmodificationexception will throw, because
																// this
																// will run every time genre name is not the same.
			atlas.getGenres().add(genre);
			genreSet.add(genre);

		}
		return genreSet;
	}

	public Set<People> checkExsistCast(String[] cast) {
		Set<People> peopleSet = new TreeSet<People>();
		for (String c : cast) {
			for (People p : atlas.getPeople()) {
				if (c == p.getName()) { // if Cast entered already exist then just assign that genre object
					peopleSet.add(p);
				}
			}
			castPeople = new People(atlas.getPeople().size() + 1, c); // add a new people with id the size of existing
																		// one +1
			atlas.getPeople().add(castPeople);
			peopleSet.add(castPeople);
		}
		return peopleSet;
	}

	public People checkExsistDirector(String director) {
		for (People pn : atlas.getPeople()) {
			if (director == pn.getName()) {// if Director entered already exist then just assign that genre object
				directPeople = pn;
			}

		}
		directPeople = new People(atlas.getPeople().size() + 1, director); // add a new people with id the size of
																			// existing one +1
		atlas.getPeople().add(directPeople);
		return directPeople;
	}

}
