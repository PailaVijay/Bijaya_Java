package Collections;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
	//	Scanner sc= new Scanner(System.in);
		
	//	System.out.println("Enter number");
	//   int num=	sc.nextInt();
		int num= 121;
		int temp=num;
		int rem;
		int rev=0;
		
		while(temp!=0)
		{
			rem= temp%10;
			rev= rev*10+rem;
			temp= temp/10;
			
		}
		if(num==rev)
		{
			System.out.println(num+" :is a palindrome number");
		}
		else
		{
			System.out.println(num+" :is not a palindrome number");
		}
	}

}
