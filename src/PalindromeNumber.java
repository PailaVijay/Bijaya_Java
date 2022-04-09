
public class PalindromeNumber {

	public static void main(String[] args) {
		int num=125521;
		int temp=num;
		int rem;
		int reverse=0;
       
		while(num!=0)
		{
			rem=num%10;
			reverse= reverse*10+rem;
			num=num/10;
		}
		if(temp==reverse)
		{
			System.out.println(temp+" no. is a palindrome");
		}
		else
		{
			System.out.println(temp+" no. is a not palindrome");
		}
	}

}
