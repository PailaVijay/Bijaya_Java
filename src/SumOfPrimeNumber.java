
public class SumOfPrimeNumber {

	public static void main(String[] args) {
		//System.out.println(getPrimeNo(34));
		int num=34;
		boolean flag =false;
		
		for(int i=2;i<=num/2;i++)
		{
			if(checkPrimeNo(i)) {
				
				if(checkPrimeNo(num-i)) {
					
					System.out.println(num+"="+i+"+"+ (num-i));
					flag= true;
				}
			}
		}
      if(!flag)
      {
    	  System.out.println(num+":cannot be expressed as the prime number");
      }
	}
	
	public static boolean checkPrimeNo(int num)
	{
		boolean isPrime=true;
		
		for(int i=2;i<=num/2;i++) {
			
			if(num%i==0)
			{
				isPrime=false;
			}
		}
		return isPrime;
		
		
	}

}
