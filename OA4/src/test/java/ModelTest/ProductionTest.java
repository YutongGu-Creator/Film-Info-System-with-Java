package ModelTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import MovieApplicationModel.Film;
import MovieApplicationModel.Production;
import MovieApplicationModel.Tvseries;

public class ProductionTest {
	@Test
	public void inheritanceTest() {
		Production film = new Film();
		Production TV = new Tvseries();

		assertTrue(film instanceof Film);
		assertTrue(TV instanceof Tvseries);
	}

}
