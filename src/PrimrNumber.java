
public class PrimrNumber {

	public static void main(String[] args) {
		int num=17;
		int temp=0;
	/*	boolean flag=false;
		
		for (int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
        if(!flag)
        {
        	System.out.println(num+": is  prime number");

        }
        else
        {
        	System.out.println(num+" : is not prime number");

        }   */
		
		// second method for finding prime number
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			temp=temp+1;
		}
		if(temp>0)
		{
			System.out.println(num+" : is not prime number");
		}
		else
		{
			System.out.println(num+" : is prime number");
		}
	}

}
