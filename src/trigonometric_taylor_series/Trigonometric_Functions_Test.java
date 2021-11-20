package trigonometric_taylor_series;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Trigonometric_Functions_Test {
	
	double value=0.1;

	@Test
	void test_sin1() throws Power_Exception, Factorial_Exception
	{
		// validating the values of sin(x) with Math.sin(x) 
		assertEquals(Trigonometric_Functions.sin(4), Math.sin(4), value);
	}

	@Test
	void test_cos1() throws Power_Exception, Factorial_Exception
	{
		// validating the values of cos(x) with Math.cos(x) 
		assertEquals(Trigonometric_Functions.cos(4), Math.cos(4), value);
	}

	@Test
	void test_tan1() throws Power_Exception, Factorial_Exception
	{
		// validating the value of tan(x) with Math.tan(x)
		assertEquals(Math.tan(4), Trigonometric_Functions.tan(4), value);
	}
	
	@Test
	void test_sin2() throws Power_Exception, Factorial_Exception
	{
		//Validating the value of sin(x) from given degrees using Java Math class
		assertEquals(Math.sin(Math.toRadians(40)), Trigonometric_Functions.sin(
				Trigonometric_Functions.degree_to_radian(40)), value);
	}

	@Test
	void test_cos2() throws Power_Exception, Factorial_Exception
	{
		//Validating the value of cos(x) from given degrees using Java Math class
		assertEquals(Math.cos(Math.toRadians(40)), Trigonometric_Functions.cos(
				Trigonometric_Functions.degree_to_radian(40)), value);
	}

	@Test
	void test_tan2() throws Power_Exception, Factorial_Exception
	{
		//Validating the value of tan(x) from given degrees using Java Math class
		assertEquals(Math.tan(Math.toRadians(40)), Trigonometric_Functions.tan(
				Trigonometric_Functions.degree_to_radian(40)), value);
	}

	@Test
	void test_sin3() throws Power_Exception, Factorial_Exception
	{
		
		assertEquals(Trigonometric_Functions.sin(120), Math.sin(120), value);
	}

	@Test
	void test_cos3() throws Power_Exception, Factorial_Exception
	{
		
		assertEquals(Trigonometric_Functions.cos(120), Math.cos(120), value);
	}

	@Test
	void test_tan3() throws Power_Exception, Factorial_Exception
	{
		
		assertEquals(Trigonometric_Functions.tan(120), Math.tan(120), value);
	}
	
	@Test
	public void test_degree_to_radian() {
		assertEquals(Math.toRadians(20), Trigonometric_Functions.degree_to_radian(20), value);
	}
	
	@Test
	public void test_factorial() throws Power_Exception, Factorial_Exception
	{
		assertEquals(120, Trigonometric_Functions.factorial(5));
	}
	
	@Test
	public void test_power() throws Power_Exception, Factorial_Exception
	{
		assertEquals(Math.pow(4, 2), Trigonometric_Functions.power(4, 2));
	}
	
}
