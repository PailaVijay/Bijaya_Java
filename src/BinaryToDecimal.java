
public class BinaryToDecimal {

	public static void main(String[] args) {

		System.out.println(convertBinaryToDecimal(10011011));

	}
	public static long convertBinaryToDecimal(long num)
	{
		long decimal=0, i=0;
		while(num!=0)
		{
			long rem=num%10;
			num=num/10;
			decimal += rem*Math.pow(2, i);
			i++;
			 
		}
		return decimal;
	}

}
