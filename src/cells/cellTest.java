package cells;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class cellTest {
	private static cell c = new cell(1,2);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		c = new cell(1,2);
		
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetX() {
		assertEquals(c.getX(),1);
	}

	@Test
	public void testLeft() {
		c.left();
		assertEquals(c.getX(),1);
		assertEquals(c.getY(),1);
	}

	@Test
	public void testUp() {
		c.up(1);
		assertEquals(c.getX(),0);
	}

}
