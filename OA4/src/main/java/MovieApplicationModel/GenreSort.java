package MovieApplicationModel;

import java.util.Comparator;

public class GenreSort implements Comparator {
	public int compare(Object o1, Object o2) {
		return ((Genre) o1).getGenre().compareToIgnoreCase(((Genre) o2).getGenre()); // sort string in ascending order
	}
}
