package ArrayConcept;

public class CaseSensitive {

	public static void main(String[] args) {
	
	String name= "WelComMEToAuToMATionTesTiNG123";
	int Upper=0;
	int Lower=0;
	int special=0;
	for(int i=0;i<name.length();i++)
	{
		char ch=name.charAt(i);
		if(ch>= 'A' && ch<='Z')
		{
			Upper++;
			
		}
		else if(ch>='a' && ch<='z')
		{
			Lower++;
			
		}
		else
		{
			special++;
		}
	}
	System.out.println(Upper+" : uppercase letters ");
	System.out.println(Lower+" : lowercase letters ");
	System.out.println(special+" : special letters");
	}

}
