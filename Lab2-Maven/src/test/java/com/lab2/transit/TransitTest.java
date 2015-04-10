 package com.lab2.transit;
	import java.util.Arrays;
	import static org.junit.Assert.*;
	import org.junit.runner.RunWith;
	import org.junit.runners.Parameterized;
	import org.junit.Test;
	import org.junit.runners.Parameterized.Parameters;
	import java.util.Collection;
	
	@RunWith(Parameterized.class)
	public class TransitTest {
	    private static final double DELTA = 1e-15;
		private double expected;
		private int age;
		private String time;
		private boolean isHoliday;
		@Parameters
		public static Collection<Object[]> testParams(){
		return Arrays.asList(new Object[][]{
					{0.0,4,"6:00",false},
					{0.0,5,"1:00",false},
				    {2.5,6,"10:00",false},
					{0.0,65,"11:00",false},
					{2.5,64,"2:00",false},
					{0.0,72,"9:01",false},
					{2.5,3,"9:00",false},
					{0.0,70,"6:59",false},
					{2.5,69,"7:00",false},
					{0.0,71,"7:00",true},
					{0.0,75,"9:00",true}
				
			});
		}
		
	public TransitTest(double expected, int age, String time,boolean isHoliday){
		this.expected=expected;
		this.age=age;
		this.time=time;
		this.isHoliday=isHoliday;
	
	}
@Test
	public void calculateFareTest() {
	assertEquals(expected, FareCalculator.calculateFare(age, time, isHoliday), DELTA);
	}




	@Test
	public void test() {
		fail("Not yet implemented");
	}

}

