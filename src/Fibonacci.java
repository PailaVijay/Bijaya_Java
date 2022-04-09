
public class Fibonacci {

	
	
	
	public static void Fibo(int no) {
		
		int num1= 0;
		int num2= 1;
		int num3=0;
		int i=0;
		
		while(i<no)
		{
			num3= num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			i++;
			
		}
		
		
		
	}
	public static void main(String[] args) {
		
		
		Fibo(10);
		
	}
}
