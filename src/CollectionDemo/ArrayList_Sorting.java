package CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Sorting {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("Dog");
		arr.add("Cat");
		arr.add("Tiger");
		arr.add("Lion");
		arr.add("Horse");
		arr.add("Elephant");
		// before sorting
		System.out.println("Before Sorting : "+arr);
		
		// After sorting
		Collections.sort(arr);
		System.out.println("After Sorting : "+arr);
		
		
	/*	String [] animal= {"Dog","Cat","Tiger","Lion","Horse","Elephant"};
	 	Arrays.sort(animal);
	 	
	 	// create empty ArrayList
	 	ArrayList<String> arr= new ArrayList<String>();
	 	
	 	for(String a:animal)
	 	{
	 		if(!arr.equals(a))
	 		{
	 			arr.add(a);
	 		}
	 	}
	
	 	for(String a:arr)
	 	{
	 		System.out.println(a);
	 	}      */
		
		
	}

}
