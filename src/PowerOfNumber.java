
public class PowerOfNumber {

	public static void main(String[] args) {
		// power of number
		int base= 5;
		int exponent=9;
		long result=1;
		
		while(exponent!=0)
		{
			result= result*base;
			exponent--;
			
		}
		//System.out.println(result);
		System.out.println(Math.pow(5, 2));

	}

}
