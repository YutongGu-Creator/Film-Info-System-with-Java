package ModelTest;

import static org.junit.Assert.*;

import org.junit.Test;

import MovieApplicationModel.GenreSort;

public class GenreSortTest {

	@Test
	public void creatAndTest() {
		GenreSort genreSort = new GenreSort();

		assertNotNull(genreSort);
	}
}
