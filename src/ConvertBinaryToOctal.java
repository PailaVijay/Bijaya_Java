
public class ConvertBinaryToOctal {

	public static void main(String[] args) {
		System.out.println(convertBintoOct(1010));

	}
	
	public static long convertBintoOct(int num)
	{
		
		int rem;
		int i=0;
		long octalNo = 1;
		while(num!=0)
		{
			rem= num%8;
			num=num/8;
			octalNo+= rem*Math.pow(2, i);
			i++;
		}
		return octalNo;
	}

}
