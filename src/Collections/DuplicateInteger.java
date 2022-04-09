package Collections;

import java.util.ArrayList;

public class DuplicateInteger {

	public static void main(String[] args) {

		int array[]={1,2,3,4,3,2,5,1,5,4};
		
		// create one empty array list
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		for(int number:array)
		{
			// checking elements in array list
			if(!list.contains(number))
			{
				//add elements into array list
				list.add(number);
			}
		}
		for(int number:list)
		{
			System.out.print(number+" ");
		}
		
	
		
		
	
	
	}

}
