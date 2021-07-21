package ModelTest;

import static org.junit.Assert.*;

import org.junit.Test;

import MovieApplicationModel.Tvseries;

public class TvseriesTest {

	@Test
	public void creatAndTest() {
		Tvseries tvseries = new Tvseries();

		assertNotNull(tvseries);
	}

}
