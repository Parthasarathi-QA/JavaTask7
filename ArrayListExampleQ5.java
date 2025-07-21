package task7Package;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExampleQ5 {
	// String ArrayList
	static ArrayList<String> al = new ArrayList<>();

	public void addElements() {
		al.add("Chennai");
		al.add("Bangalore");
		al.add("Kochin");
		al.add("Hyderabad");
		al.add("Amaravathi");
		System.out.println("ArrayList of Strings is: " + al);
	}

	public void traversingMethod1() {
		// Traversing through the ArrayList-Methods1
		for (String a : al) {
			System.out.println(a);
		}
	}

	public void traversingMethod2() {
		// Traversing through the ArrayList-Methods2
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public void removeElements() {
		// removing all
		al.removeAll(al);
		// printing the ArrayList post removing all the elements
		System.out.println("Post removal of Elements from ArrayList: " + al);
		System.out.println("Is the ArrayList empty? " + al.isEmpty());
	}

	public static void main(String[] args) {
		ArrayListExampleQ5 alObj = new ArrayListExampleQ5();
		alObj.addElements();
		alObj.traversingMethod1();
		alObj.traversingMethod2();
		alObj.removeElements();
	}
}