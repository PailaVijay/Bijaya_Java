import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		
		//String str= "ABCD";
		
		String str=sc.next();
		String org_str=str;
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse= reverse+str.charAt(i);

		}
		if(org_str.equals(reverse))
		{
			System.out.println(org_str+ "this is palindrome string");
		}
		else 
		{
			System.out.println(org_str+"this is not a palindrome string");
		}

	}

}
