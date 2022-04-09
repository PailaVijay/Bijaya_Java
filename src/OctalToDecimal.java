
public class OctalToDecimal {

	public static void main(String[] args) {
	System.out.println(convertOctToDec(25));

	}
	
	
	
	public static long convertOctToDec(int num)
	{
		int rem;
		int i=0;
		long decimal = 0;
		
		while(num!=0)
		{
			rem= num%10;
			num= num/10;
			decimal += rem*Math.pow(8, i);
			i++;
			
		}
		return decimal;
		
	}

}
