import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 5555;
		assertEquals(expected, actual);
	}

	public void testSubtract() {
		int a = 9999;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 8765;
		assertEquals(expected, actual);
	}

	public void testMultiple() {
		int a = 900;
		int b = 10;

		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);

		int expected = 9000;
		assertEquals(expected, actual);
	}

	public void testDivide() {
		int a = 9000;
		int b = 1000;

		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);

		int expected = 9;
		assertEquals(expected, actual);
	}

}
