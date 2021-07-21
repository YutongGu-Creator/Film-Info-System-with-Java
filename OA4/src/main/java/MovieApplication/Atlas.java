package MovieApplication;

import java.util.Set;
import java.util.TreeSet;

import MovieApplicationModel.Film;
import MovieApplicationModel.Genre;
import MovieApplicationModel.NameSort;
import MovieApplicationModel.People;
import MovieApplicationModel.Production;
import MovieApplicationModel.Profile;
import MovieApplicationModel.SortingChoice;
import MovieApplicationModel.Tvseries;
import MovieApplicationModel.YearSort;

public class Atlas {
	private Set<Film> films = new TreeSet<>();
	private Set<Tvseries> tvseries = new TreeSet<>();
	private Set<People> people = new TreeSet<>();
	private Set<Genre> genres = new TreeSet<>();
	private Set<Profile> Profiles = new TreeSet<>();

	public SortingChoice sortingChoice;

	// change the sortingChoice for productions existing in memory
	public void sortingChoice(int sorting) {
		if (sorting == 1) {
			sortingChoice = new NameSort();
			for (Production p : films) {
				p.setSortingChoice(sortingChoice);
			}
			for (Production p : tvseries) {
				p.setSortingChoice(sortingChoice);
			}
		}
		if (sorting == 2) {
			sortingChoice = new YearSort();
			for (Production p : films) {
				p.setSortingChoice(sortingChoice);
			}
			for (Production p : tvseries) {
				p.setSortingChoice(sortingChoice);
			}
		}
	}

	// put all the films and Tvseries together for easier handling
	public Set<Production> getProductions() {
		Set<Production> productions = new TreeSet<>();
		for (Film m : films) {
			productions.add(m);
		}
		for (Tvseries t : tvseries) {
			productions.add(t);
		}
		return productions;
	}

	// getters and setters
	public Set<Film> getFilms() {
		return films;
	}

	public void setFilms(Set<Film> films) {
		this.films = films;
	}

	public Set<Tvseries> getTvseries() {
		return tvseries;
	}

	public void setTvseries(Set<Tvseries> tvseries) {
		this.tvseries = tvseries;
	}

	public Set<People> getPeople() {
		return people;
	}

	public void setPeople(Set<People> people) {
		this.people = people;
	}

	public Set<Genre> getGenres() {
		return genres;
	}

	public void setGenres(Set<Genre> genres) {
		this.genres = genres;
	}

	public Set<Profile> getProfiles() {
		return Profiles;
	}

	public void setProfiles(Set<Profile> profiles) {
		Profiles = profiles;
	}

}
