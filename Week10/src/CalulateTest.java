import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalulateTest {
	
	@BeforeClass
	public static void greet() {
		System.out.println("Before Everything");
	}
	
	@Before
	public void perMethod() {
		System.out.println("Before each test");
	}
	
	@After
	public void afterMethods() {
		System.out.println("After each test");
	}
	
	@Test
	public void test1() {
		assertEquals(0 ,Calculate.multiply(0, 1));
		System.out.println("Test 1");
	}

	@Test
	public void test2() {
		assertEquals(1 ,Calculate.multiply(1, 1));
		System.out.println("Test 2");
	}
	
	@Test
	public void test3() {
		assertEquals(2.0 ,Calculate.multiply(1.0, 2.0), 0.0001);
		System.out.println("Test 3");
	}
	
	
}
