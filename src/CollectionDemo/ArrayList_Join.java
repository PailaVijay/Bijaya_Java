package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Join {

	public static void main(String[] args) {
		
		ArrayList<String> vehicle1= new ArrayList<String>();
		vehicle1.add("Honda");
		vehicle1.add("TVS");
		vehicle1.add("Hero");
		vehicle1.add("Bajaj");
		vehicle1.add("Suzuki");
		vehicle1.add("Yamaha");
		vehicle1.add("Royal Enfield");
		System.out.println("List of 1st Array :" + vehicle1);
		
		ArrayList<String> vehicle= new ArrayList<String>();
		vehicle.add("Honda");
		vehicle.add("TVS");
		vehicle.add("Hero");
		vehicle.add("Bajaj");
		System.out.println("List of 2nd Array :" + vehicle);

		ArrayList<String> arr= new ArrayList<String>();
		arr.addAll(vehicle1);
		arr.addAll(vehicle);
		
		System.out.println("New ArrayList: "+arr);
	}

}
