package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HasMapConcept {

	public static void main(String[] args) {
		Map<String, Integer>marks=new HashMap<String, Integer>();
		marks.put("Bijay", 100);
		marks.put("Sachin", 200);
		marks.put("Rohit", 300);
		marks.put("Shewag",400);
		marks.put("Virat", 600);
		
	    System.out.println("size ="	+marks.size());
	    
	  Iterator it=  marks.entrySet().iterator();
	  
	  while(it.hasNext())
	  {
		  Map.Entry pairs= (Map.Entry)it.next();
		  System.out.println(pairs);
	  }
	  
	  // convert Hashmap keys into arrayList
	  
	  List<String> name= new ArrayList<String>(marks.keySet());
	  System.out.println(name);
	  for(String list:name)
	  {
		  System.out.println(list);
	  }
	  
	  // convert hashmap values to arraylist
	  
	  List<Integer> value= new ArrayList<Integer>(marks.values());
	  System.out.println(value);
	  for(Integer val:value)
	  {
		  System.out.println(val);
	  }
		
	

	}

}
