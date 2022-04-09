
public class PrimeNumber_Interval {

	public static void main(String[] args) {
	 
		int low= 1;
		int high=100;
		boolean flag=false;
		while(low<high)
		{
			flag = false;
			for(int i=2;i<low/2;i++)
			{
				if(low%i==0)
				{
					flag=true;
					break;
				}
				
			}
			if(!flag)
			{
				System.out.println(low+" ");
			}
			low++;
				
		}
		
		// second method to print prime numbers from 1 to 100
		
		for (int i=1; i<=100;i++)
		{
			int temp=0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				temp= temp+1;
			}
			if(temp==0)
			{
				System.out.println(i);
			}
			else
			{
				temp=0;
			}
		}
		

	}

}
