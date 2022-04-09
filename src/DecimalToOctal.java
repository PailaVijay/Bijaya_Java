
public class DecimalToOctal {

	public static void main(String[] args) {
		
		System.out.println(convertDecToOct(25));
		

	}
public static long convertDecToOct(int num)
{
	
	int rem;
	int i=1;
	long octalNo = 0;
	while(num!=0)
	{
		rem= num%8;
		num=num/8;
		octalNo += rem*i;
		i*=10;
		
		
	}
	return octalNo;
	
}
}
