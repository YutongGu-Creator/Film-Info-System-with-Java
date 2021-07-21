package MovieApplicationModel;

import java.util.Set;

import MovieApplication.Atlas;

public class ProductionFactory {

	public Production makeProduction(Atlas atlas, Boolean TV, String text, String description, int year,
			Set<Genre> genre, People director, Set<People> cast) {
		// Create Tvseries or Film instance by the TV value passed in
		if (TV == true) {
			Tvseries tvseries = new Tvseries();
			tvseries.setTitle(text);
			tvseries.setDescription(description);
			tvseries.setYear(year);
			tvseries.setGenre(genre);
			tvseries.setCreator(director);
			tvseries.setCast(cast);
			tvseries.setSortingChoice(new NameSort());
			atlas.getTvseries().add(tvseries); // add the newly created Tvseries object into data set
			return tvseries;
		} else {
			Film film = new Film();
			film.setTitle(text);
			film.setDescription(description);
			film.setYear(year);
			film.setGenre(genre);
			film.setDirector(director);
			film.setCast(cast);
			film.setSortingChoice(new NameSort());
			atlas.getFilms().add(film); // add the newly created Film object into data set
			return film;
		}

	}
}
