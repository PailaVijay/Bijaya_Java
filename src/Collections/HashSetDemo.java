package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> h= new HashSet<String>();
		
		h.add("vijay");
		h.add("Kumar");
		h.add("Reddy");
		h.add("Paila");
		h.add("Bijaya");
		
		int size=h.size();
		System.out.println(size);
		
		
		Iterator <String>it=h.iterator();
		
		while(it.hasNext())
		{
			String name=it.next();
			System.out.println(name);
		}
		 

	}

}
