
public class FactorialResursion {

	public static void main(String[] args) {
	
	 System.out.println(factorialNo(5));

	}
	public static int factorialNo(int num)
	{
		if(num>=1)
		{
			return num*factorialNo(num-1);
		}
		return 1;
	}

}
