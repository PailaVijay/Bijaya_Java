package Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList();
		list.add(969);
		list.add("vijay");
		list.add(93.21);
		
	    int size=list.size();
	    
	    for(int i=0; i<size;i++)
	    {
	    	System.out.println(i+" is "+ list.get(i));
	    }
		

	}

}
