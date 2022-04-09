
public class AmstrongNumber {

	public static void main(String[] args) {
		// 153= 1*1*1 + 5*5*5 + 3*3*3 = 1+125+27=153
		int num= 153;
		int actNumber=num;
		int rem;
		double result=0;
		
		while(actNumber!=0)
		{
			rem=actNumber%10;
			result= result+ Math.pow(rem, 3);
			actNumber= actNumber/10;
			
		}
		if(result==num)
		{
			System.out.println(num+" : is amstrong number ");
		}
		else
		{
			System.out.println(num+ ": is not amstrong number");
		}
	}

}
