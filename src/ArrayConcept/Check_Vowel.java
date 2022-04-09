package ArrayConcept;

public class Check_Vowel {

	public static void main(String[] args) {
		
		String name="WelcomeToIndia";
		name.toLowerCase();
		int vowel=0;
		int con=0;
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='o' || name.charAt(i)=='i' || name.charAt(i)=='u')
				
			{
				vowel++;
			}
			else
			{
				con++;
			}
		}
		
	
		
		System.out.println("vowel count :"+vowel);
		System.out.println("consunant count :"+con);
      }
	
	

}
