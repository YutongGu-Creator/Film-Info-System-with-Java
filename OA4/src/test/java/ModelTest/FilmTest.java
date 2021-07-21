package ModelTest;
import static org.junit.Assert.*;

import org.junit.Test;

import MovieApplicationModel.Film;


public class FilmTest {

	@Test
	public void creatAndTest() {
		Film film = new Film();

		assertNotNull(film);
	}

}
