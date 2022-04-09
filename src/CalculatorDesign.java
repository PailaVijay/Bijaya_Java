import java.util.Scanner;

public class CalculatorDesign {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		
		double num1=sc.nextDouble();
		double num2= sc.nextDouble();
		
		System.out.println("please enter operator: (+,-,*,/):");
		
		char operator=sc.next().charAt(0);
		double result = 0;
		switch(operator) {
		
		case '+': result=num1+num2; break;
		case '-': result=num1-num2; break;
		case '*': result=num1*num2; break;
		case '/': result=num1/num2; break;
		default : System.out.println("please pass the correct operator");break;
		
		}
		System.out.println(result);

	}

}
