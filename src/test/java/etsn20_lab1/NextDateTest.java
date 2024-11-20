package etsn20_lab1;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class NextDateTest {
	private static NextDate nd;

	@BeforeClass
	public static void setup() {
		nd = new NextDate(0, 0, 0);
	}

	@Test
	public void testInvalidDay() {
		assertEquals("Invalid Input Date", nd.run(8, -1, 2017));
	}
	
	@Test
	public void testDayGreaterThan29InFeb() {
		assertEquals("Invalid Input Date", nd.run(2, 30, 2019));
	}
	
	@Test
	public void testDay29InFebNotLeapYear() {
		assertEquals("Invalid Input Date", nd.run(2, 29, 2019));
	}
	
	@Test
	public void testDay29InFebLeapYear() {
		assertEquals("3/1/2008", nd.run(2, 29, 2008));
	}
	
	@Test
	public void testDay28InFeb() {
		assertEquals("3/1/2019", nd.run(2, 28, 2019));
	}
	
	@Test
	public void testDay28InFebLeapYear() {
		assertEquals("2/29/2008", nd.run(2, 28, 2008));
	}
	
	@Test
	public void testDayLessThan28InFeb() {
		assertEquals("2/6/2006", nd.run(2, 5, 2006));
	}
	
}
