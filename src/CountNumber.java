
public class CountNumber {

	public static void main(String[] args) {
		long num=9692210907l;
		int count=1;
		while(num!=0)
		{
			num=num/10;
			count++;
			
		}
		
		System.out.println("number of digits: "+count);
	}

}
