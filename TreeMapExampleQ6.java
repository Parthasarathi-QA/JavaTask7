package task7Package;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExampleQ6 {

	static TreeMap<Integer, String> myTreeMap = new TreeMap<>();

	// To add Keys and Values
	public static void putData() {
		myTreeMap.put(5, "John");
		myTreeMap.put(2, "Paul");
		myTreeMap.put(7, "Andrew");
		myTreeMap.put(9, "Jasmin");
		myTreeMap.put(10, "Mary");
		myTreeMap.put(3, "Richard");
		myTreeMap.put(4, "William");
		myTreeMap.put(1, "Kate");
		myTreeMap.put(6, "Elizabeth");
		myTreeMap.put(8, "James");
	}

	// To print the names in sorted order and to print the Keys and Values of
	// TreeMap
	public static void printData() {
		// printing the Key and Value of the treeMap
		System.out.println("//***** Keys and Values of the treeMap *****//");
		for (Entry<Integer, String> entry : myTreeMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		System.out.println("                                                          ");

		// Printing the Name in Sorted order
		System.out.println("//***** Printing the Name (Values) in Sorted order *****//");
		myTreeMap.values().stream().sorted().forEach(System.out::println);
	}

	public static void main(String[] args) {

		putData();
		printData();
	}
}
