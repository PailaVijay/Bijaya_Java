package CollectionDemo;

import java.util.ArrayList;

public class ArrayList_Color {

	public static void main(String[] args) {
		
		
		//String[] name= {"blue","Orange","Balck","red","Yellow"};
		
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("black");
		arr.add("white");
		arr.add("blue");
		arr.add("red");
		arr.add("orange");
		// add element in the first index
		arr.add(0, "Yellow");
		System.out.println(arr);
		
		// update element 
	    arr.set(2, "violet");
		System.out.println(arr);
		
		// remove the element from Array list
		arr.remove(0);
		System.out.println(arr);
		
		// search the element 
		
	    if(arr.contains("orange"))
	    {
	    	System.out.println("Element found");
	    }
	    else
	    {
	    	System.out.println("Element is not found");
	    }
		
	   
        		
		

	}

}
