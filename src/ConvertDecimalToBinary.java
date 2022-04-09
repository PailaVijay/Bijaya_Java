
public class ConvertDecimalToBinary {

	public static void main(String[] args) {
		
		System.out.println(convertDecToBin(155)); //10011011
	}
	
	public static long convertDecToBin(int num)
	{
		long binaryNo=0;
		int rem;
		int i=1;
		while(num!=0)
		{
		
	    rem= num%2;
		num= num/2;
		binaryNo += rem*i;
		i*=10;
		
		}
		 return binaryNo;
	 

}
}