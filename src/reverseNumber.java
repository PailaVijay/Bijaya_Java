
public class reverseNumber {

	public static void main(String[] args) {
	 int num=25487;
	 int rem;
	 int reverse=0;
	 while(num!=0)
	 {
		 rem= num%10;
		 reverse= reverse*10+rem;
		 num= num/10;
	 }
	 System.out.println("reverse number is: "+reverse);

	}

}
