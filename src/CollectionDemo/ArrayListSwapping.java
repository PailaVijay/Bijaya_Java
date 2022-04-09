package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSwapping {

	public static void main(String[] args) {
		ArrayList<String> vehicle1= new ArrayList<String>();
		vehicle1.add("Honda");
		vehicle1.add("TVS");
		vehicle1.add("Hero");
		vehicle1.add("Bajaj");
		vehicle1.add("Suzuki");
		vehicle1.add("Yamaha");
		vehicle1.add("Royal Enfield");
		
		for(String v:vehicle1)
		{
			System.out.println(v);
		}
		Collections.swap(vehicle1, 6, 0);
		System.out.println(vehicle1);

	}

}
