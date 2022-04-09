package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToArray {

	public static void main(String[] args) {
		
		HashSet<String> h=new HashSet<String>();
		
		h.add("vijay");
		h.add("kumar");
		h.add("reddy");
		h.add("QA");
		
		System.out.println(h);
		
		// convert HashSet to Array
		
	/*	String [] name= new String[h.size()];
		
		h.toArray(name);
		
		for(Object a:name)
		{
			System.out.println(a);
		}  */
		
		
		// Convert HashSet to TreeSet
		
		Set<String> set= new TreeSet<String>(h);
		
		System.out.println(set);
	}

}
