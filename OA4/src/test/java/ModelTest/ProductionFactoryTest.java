package ModelTest;

import static org.junit.Assert.*;

import org.junit.Test;

import MovieApplicationModel.ProductionFactory;

public class ProductionFactoryTest {

	@Test
	public void creatAndTest() {
		ProductionFactory productionFactory = new ProductionFactory();

		assertNotNull(productionFactory);
	}

}
