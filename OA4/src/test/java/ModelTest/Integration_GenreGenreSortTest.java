package ModelTest;

import static org.junit.Assert.*;

import org.junit.Test;

import MovieApplicationModel.Genre;
import MovieApplicationModel.GenreSort;

public class Integration_GenreGenreSortTest {

	@Test
	public void compareTest() {
		GenreSort genreSort= new GenreSort();
		Genre g1 = new Genre(1, "Comedy");
		Genre g2 = new Genre(2, "Horror");
		assertEquals(genreSort.compare(g1, g2), -5);
	}

}
