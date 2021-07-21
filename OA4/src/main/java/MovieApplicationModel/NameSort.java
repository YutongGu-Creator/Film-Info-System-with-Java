package MovieApplicationModel;

public class NameSort implements SortingChoice {
	public int compare(Object o1, Object o2) {
		return ((Production) o1).getTitle().compareToIgnoreCase(((Production) o2).getTitle()); // sort string in
																								// ascending order
	}
}
