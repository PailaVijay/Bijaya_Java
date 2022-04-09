package CollectionDemo;

import java.util.ArrayList;

public class ArayList_Replace {

	public static void main(String[] args) {
		
		ArrayList<Integer> n= new ArrayList<Integer>();
		
		n.add(1);
		n.add(2);
		
		System.out.println(n);
	
		int num= 3;
		n.set(0, num);
		
		int s=n.size();
		
		for(int i=0;i<s;i++)
		{
			System.out.println(n.get(i));
		}
		
		
	

	}

}
