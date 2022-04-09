package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;



public class ArrayList_Reverse {

	public static void main(String[] args) {
	
		ArrayList<String> vehicle= new ArrayList<String>();
		vehicle.add("Honda");
		vehicle.add("TVS");
		vehicle.add("Hero");
		vehicle.add("Bajaj");
		vehicle.add("Suzuki");
		vehicle.add("Yamaha");
		vehicle.add("Royal Enfield");
		
		System.out.println("Before reversing :" +vehicle);
		
		 Collections.reverse(vehicle);
		 System.out.println("After revesing :" + vehicle);
	}

}
