package Collections;

import java.util.ArrayList;

public class DuplicateString {
	
	
	public static void main(String[] args) {
		
		String name[]= {"vijay","sachin","yuvi", "dravid", "vijay","dravid", "vijay", "sachin" };
		
		
		// creating one empty array list
		ArrayList<String> names= new ArrayList<String>();
		
		for(String player:name)
		
		if(!names.contains(player))
		{
			names.add(player);
		}
		for(String player:names)
		{
			System.out.println(player);
		}
		
		
		
	}

}
