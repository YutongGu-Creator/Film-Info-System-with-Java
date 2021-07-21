package ModelTest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import MovieApplicationModel.Profile;


public class ProfileTest {
	
	@Test
	public void creatAndTest() {
		Profile profile = new Profile();

		assertNotNull(profile);
	}
}
