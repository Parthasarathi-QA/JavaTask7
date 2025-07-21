package task7Package;

import java.util.LinkedList;

public class ListToArrayConversionQ7 {

	// LinkedList Object creation
	LinkedList<String> myList = new LinkedList<>();

	public void publishList() {
		myList.add("Chennai");
		myList.add("Mumbai");
		myList.add("Kolkata");
		myList.add("Noida");
		myList.add("New Delhi");
	}

	public void conversion() {
		// Converting list to array
		String a[] = new String[myList.size()];
		a = myList.toArray(a);
		//Printing the array
		for (String city : a) {
            System.out.println(city);
        }
	}

	public static void main(String[] args) {
		ListToArrayConversionQ7 obj = new ListToArrayConversionQ7();
		obj.publishList();
		obj.conversion();

	}

}
