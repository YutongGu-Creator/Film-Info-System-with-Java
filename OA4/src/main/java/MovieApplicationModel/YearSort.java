package MovieApplicationModel;

public class YearSort implements SortingChoice {
	public int compare(Object o1, Object o2) { // sort number in descending order
		if (((Production) o1).getYear() < ((Production) o2).getYear()) {
			return 1;
		} else if (((Production) o1).getYear() > ((Production) o2).getYear()) {
			return -1;
		} else {
			return 0;
		}
	}
}
