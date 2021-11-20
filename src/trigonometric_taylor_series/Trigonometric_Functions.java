package trigonometric_taylor_series;

public class Trigonometric_Functions {
	
	public static double pi=3.14159265359;
	
	public static double complete_angle=360;
	
	// degree_to_radian converts the degree value of 'i' into radian.
	public static double degree_to_radian(double i) 
	{
		return (2 * i * pi)/complete_angle;
	}
	
	// radian_normalize normalize the radian value of 'i'.
	public static double radian_normalize(double i) 
	{
		return (i % ( 2 * pi));
	}
	
	//power method to compute the power of the value.
	public static double power(double base_value,double exponent_value) throws Power_Exception {
		
		double power_value=1;
		
		if(exponent_value==0) {
			return power_value;
		}
		
		if(exponent_value<0) {
			throw new Power_Exception("the negative exponent value cann't be computed.");
		}
		
		for(int j=1; j<=exponent_value; j++) {
			power_value = power_value * base_value;
		}
		
		return power_value;
	}
	
	//To compute the factorial of the given number.
	public static long factorial(int number) throws Factorial_Exception 
	{
		long fact=1;
		
		if(number >=0)
		{
			for(int j=1; j<=number; j++)
			{
				fact = fact*j;
			}
		}
		else
			throw new Factorial_Exception("The input number is not valid");
		
		return fact;
	}
	
	// sin function
	public static double sin(double input_angle) throws Power_Exception, Factorial_Exception {
		
		double angle = radian_normalize(input_angle);
		double sin=0;
		
		for(int i=1;i<=11;i++)
		{
			sin = sin + (power(-1, i-1)*
					power(angle, (2*i)-1)/factorial((2*i)-1));
		}
		
		return sin;
	}
	
	// cos function
	public static double cos(double input_angle) throws Power_Exception, Factorial_Exception {
		
		double angle = radian_normalize(input_angle);
		double cos=0;
		
		for(int i=1;i<=11;i++)
		{
			cos = cos + (power(-1, i-1)*
					power(angle, 2*(i-1))/factorial(2*(i-1)));
		}
		
		return cos;
	}
	
	// tan function
	public static double tan(double input_angle) throws Power_Exception, Factorial_Exception {
		
		double tan=0;
		tan = sin(input_angle)/cos(input_angle);
		
		return tan;
	}
	
}
