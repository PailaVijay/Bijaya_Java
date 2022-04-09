package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
	
		Map<String,Integer> name= new HashMap<String,Integer>();
		
		name.put("Bijay", 1);
		name.put("kumar", 2);
		name.put("reddy", 3);
		name.put("paila", 4);
		name.put("Bijaya", 5);
		
		Set<String> n=name.keySet();
		 
		
		System.out.println(name);
		

	}

}
