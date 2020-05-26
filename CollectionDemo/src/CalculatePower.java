
public class CalculatePower {
	
	int result =1;
	
	public  int power(int base, int exponent, int result)
	{
		
		while(exponent > 0)
		{
			result = result * base;
			exponent --;
		}
		
		System.out.println("Power of: "+ base +" is "+ result);
			return  result;
	}

	public static void main(String[] args) {
		
		CalculatePower cal = new CalculatePower();
		cal.power(2, 3, 1);
		
		

	}

}
