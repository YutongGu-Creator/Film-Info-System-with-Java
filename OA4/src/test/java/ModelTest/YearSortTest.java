package ModelTest;

import static org.junit.Assert.*;

import org.junit.Test;

import MovieApplicationModel.YearSort;

public class YearSortTest {

	@Test
	public void creatAndTest() {
		YearSort yearSort = new YearSort();

		assertNotNull(yearSort);
	}

}
