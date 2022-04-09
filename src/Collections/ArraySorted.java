package Collections;

import java.util.ArrayList;
import java.util.Arrays;


public class ArraySorted {

	public static void main(String[] args) {
	
		
		int [] a= {5,2,1,10,55,41,23,14,55,36,2,5,1,10,10,9,23};
		
	
		// creating one empty array list
		ArrayList<Integer> arr= new ArrayList<Integer>();
		Arrays.sort(a);
		
//	   for(int i=0;i<a.length;i++)
//	   {
//		   System.out.println(a[i]);
//	   }
		
		for(int num:a)
		{
			if(!arr.contains(num))
			{
				arr.add(num);
			}
		}
		for(int num:arr)
		{
			System.out.println(num);
			
		}  
		
		

	}

}
