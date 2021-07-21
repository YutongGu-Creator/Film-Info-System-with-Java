package ModelTest;

import static org.junit.Assert.*;

import org.junit.Test;

import MovieApplicationModel.NameSort;

public class NameSortTest {

	@Test
	public void creatAndTest() {
		NameSort nameSort = new NameSort();

		assertNotNull(nameSort);
	}
}
