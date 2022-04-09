package Collections;

import java.util.HashMap;
import java.util.Map;

public class ArrayCount {
	// Function to find the repeating elements with their count
	
	public static HashMap<Integer, Integer> findRepeating(int arr[], int size) {
		// Hash map to store the frequency of elements
		HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();
		
	   // Loop to store the frequency of elements of array
	     for(int i=0; i<size;i++)
	     {
	    	 if(frequency.containsKey(arr[i]))
	    	 {
	    		 frequency.put(arr[i], frequency.get(arr[i])+1);
	    	 }
	    	 else
	    	 {
	    		 frequency.put(arr[i], 1);
	    	 }
	     }
	     return frequency;
	}

	
	public static void main(String[] args) {
		
		int[] arr= {2,3,2,4,5,6,5,4,9,7,5,1,3,7,7,6,4,5};
		int arr_size = arr.length;
		HashMap<Integer,Integer>frequency=findRepeating(arr, arr_size);
		
		for(Map.Entry<Integer, Integer> entry  : frequency.entrySet()) 
		{
			if(entry.getValue()>=1)
			{
				System.out.println(entry.getKey()+" :no of repeat "+ entry.getValue());
			}
		}
		

	}

}
