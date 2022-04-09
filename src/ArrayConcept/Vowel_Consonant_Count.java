package ArrayConcept;

public class Vowel_Consonant_Count {

	
	public static void vcCount(String str)
	{
		int vow=0;
		int con=0;
		// initialize string 
		String name= "aeiouAEIOU";
		for (int i=0;i<name.length();i++ )
		{
			
			if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z'))
			{
				if(name.indexOf(str.charAt(i)) != -1)
				{
					vow++;
				}
				else
				{
					con++;
				}
				
			}
		}
		System.out.println("number of vowel :"+ vow + "\n number of consonant :"+ con);
	    
		
	}
	public static void main(String[] args) {
		
		String n= "BijAyAKumarReDdY";
		vcCount(n);

	}

}
