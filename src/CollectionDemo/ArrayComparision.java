package CollectionDemo;

import java.util.ArrayList;

public class ArrayComparision {

	public static void main(String[] args) {
		
		ArrayList<String> vehicle1= new ArrayList<String>();
		vehicle1.add("Honda");
		vehicle1.add("TVS");
		vehicle1.add("Hero");
		vehicle1.add("Bajaj");
		vehicle1.add("Suzuki");
		vehicle1.add("Yamaha");
		vehicle1.add("Royal Enfield");
		
		ArrayList<String> vehicle2= new ArrayList<String>();
		vehicle2.add("Honda");
		vehicle2.add("TVS");
		vehicle2.add("Suzuki");
		vehicle2.add("Yamaha");
		vehicle2.add("Bajaj");
		
		ArrayList<String> vehicle = new ArrayList<String>();
		for(String v:vehicle1)
		{
			vehicle.add(vehicle2.contains(v) ? "yes" : "no");
		
		}
		
		System.out.println(vehicle);
	}

}
