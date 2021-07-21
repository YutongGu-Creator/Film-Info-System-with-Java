package ModelTest;

import static org.junit.Assert.*;

import org.junit.Test;

import MovieApplicationModel.People;

public class PeopleTest {

	@Test
	public void setterTest() {
		People charlie = new People();
		
		charlie.setName("Charlie");

		assertEquals(charlie.getName(), "Charlie");
	}

}
