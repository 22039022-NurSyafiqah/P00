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
	public void testAdd() {
//    fail("Not yet implemented");

		// Arrange
		int a = 1234;
		int b = 8765;

		// Act
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		// Assert
		int expected = 9999;
		assertEquals(expected, actual);
	}

	@Test
	public void testSubtract() {
		// Arrange
		int a = 9876;
		int b = 4321;

		// Act
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);

		// Assert
		int expected = 5555;
		assertEquals(actual, expected);
	}

	@Test
	public void testMultiple() {
		// Arrange
		int a = 3;
		int b = 7;

		// Act
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);

		// Assert
		int expected = 21;
		assertEquals(actual, expected); // ensure that a * b = 21. Matches with expected.
	}

	@Test
	public void testDivide() {
		// Arrange
		int a = 20;
		int b = 2;

		// Act
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);

		// Assert
		int expected = 10;
		assertEquals(actual, expected);
	}

}