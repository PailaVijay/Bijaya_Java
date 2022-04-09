package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Extracting {

	public static void main(String[] args) {
		ArrayList<String> vehicle= new ArrayList<String>();
		vehicle.add("Honda");
		vehicle.add("TVS");
		vehicle.add("Hero");
		vehicle.add("Bajaj");
		vehicle.add("Suzuki");
		vehicle.add("Yamaha");
		vehicle.add("Royal Enfield");
		System.out.println("Before extracting :" +vehicle);
		
		
	    List v=	vehicle.subList(0, 4);
	    System.out.println(v);

	}

}
