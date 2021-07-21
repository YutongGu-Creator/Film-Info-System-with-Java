package MovieApplicationModel;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// used for storing most of the common things of Film and Tvseries
public abstract class Production implements Comparable<Production> {
	private String title;
	private int year;
	private Set<Genre> genre;
	private Set<Genre> sortedGenre;
	private Set<People> cast;
	private String description;
	private SortingChoice sortingChoice; // context class for strategy pattern

	public Production() {

	}

	public Production(String title, int year, Set<Genre> genre, Set<People> cast, String description) {
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.cast = cast;
		this.description = description;
	}

	// getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Set<Genre> getGenre() {
		return genre;
	}

	public void setGenre(Set<Genre> genre) {
		this.genre = genre;
	}

	public Set<People> getCast() {
		return cast;
	}

	public void setCast(Set<People> cast) {
		this.cast = cast;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SortingChoice getSortingChoice() {
		return sortingChoice;
	}

	public void setSortingChoice(SortingChoice sortingChoice) {
		this.sortingChoice = sortingChoice;
	}

	public String showGenre() {
		sortedGenre = new TreeSet<Genre>(new GenreSort());
		for (Genre g : genre) {
			sortedGenre.add(g);
		}
		String genres = "";
		if (genre != null) {
			Iterator<Genre> it = sortedGenre.iterator(); // put the first element in the sortedGenre at the head of the
															// String
//			for (Genre g : genre) {
//				if (genre.size() == 1) {
//					genres = g.getGenre();
//				} else {
//					genres += g.getGenre();
//					genres += "|" + g.getGenre();
//				}
//			}
			if (it.hasNext()) {
				genres = it.next().getGenre();
				while (it.hasNext()) {
					genres += " | " + it.next().getGenre(); // put every other element after and with "|" at the start
				}
			}
		}
		return genres;
	}

	public String showCast() {
		String casts = "";
		if (cast != null) {
			Iterator<People> ip = cast.iterator();// put the first element in the sortedGenre at the head of the
			// String
			if (ip.hasNext()) {
				casts = ip.next().getName();
				while (ip.hasNext()) {
					casts += "|" + ip.next().getName();// put every other element after and with "|" at the start
				}
			}
		}
		return casts;
	}

	public int compareTo(Production o) {
		return this.sortingChoice.compare(this, o);
	}

}
