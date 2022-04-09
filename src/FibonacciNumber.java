
public class FibonacciNumber {

	
	public static int FibNo(int no)
	{
		
		
		if(no<=1)
		{
			return no;
			
		}
		return FibNo(no-1)+FibNo(no-2);
	}
	public static void main(String[] args) {
		
        int no=9;
		System.out.println(FibNo(9));
	}

}
