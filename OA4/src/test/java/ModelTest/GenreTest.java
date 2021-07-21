package ModelTest;
import static org.junit.Assert.*;

import org.junit.Test;

import MovieApplicationModel.Genre;


public class GenreTest {

	@Test
	public void getterTest() {
		Genre genre = new Genre(1, "Action");

		assertEquals(genre.getGid(), 1);
	}

}
