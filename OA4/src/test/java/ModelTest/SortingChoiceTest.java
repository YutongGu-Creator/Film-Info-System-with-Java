package ModelTest;

import static org.junit.Assert.*;

import org.junit.Test;

import MovieApplicationModel.NameSort;
import MovieApplicationModel.SortingChoice;



public class SortingChoiceTest {

	@Test
	public void inheritanceTest() {
		SortingChoice sortingChoice = new NameSort();

		assertEquals(sortingChoice instanceof NameSort, true);
	}


}
