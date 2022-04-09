package Collections;

public class ConvertNumberToWord {
	
	
	public static void numberToWord(char[] ch)
	{
		
		int len=ch.length;
		
		if(len==0)
		{
			System.out.println("empty string");
			return;
		}
		if(len>4)
		{
			System.out.println("Length more than 4 is not supported");
			return;
		}
		String[] single_digit= new String[]{"one","two","three","four","five","six","seven","eight","nine"};
		
		String[] two_digits = new String[] {  "", "ten", "eleven",  "twelve","thirteen",  "fourteen", "fifteen", "sixteen",
		            "seventeen", "eighteen", "nineteen" };
		       
	    String[] ten_multiples = new String[] {"","","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
	    
	    String[] ten_powers= new String[] {"Hundred", "Thousand"};
	    
	    
	}

	public static void main(String[] args) {
		

	}

}
