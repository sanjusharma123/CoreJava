package collection_framework;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		list.add("Simran");
		list.add(0, "Vaishnavi");
		list.add(null);
		list.add("Shivani");
		list.add(2, "Shreya");
//		System.out.println("List of elements: " + list);
//		System.out.println("Length of list: " + list.size());
//		System.out.println("Get value from list: " + list.get(0));
//		System.out.println("Set value into list: " + list.set(2, "Nikita"));
//		System.out.println("List of elements: " + list);
//		System.out.println("Remove element from list: " + list.remove(0));
		System.out.println("List of elements: " + list);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// toArray() method converts an arraylist into an array and returns it.
String arr[]=new String[list.size()];
list.toArray(arr);
System.out.println("Array of elements: " );
for (String s : arr) {
	System.out.println(s);
}
		String arr1[] = list.toArray(new String[0]);
		System.out.println(list);
		// Enhance for loop(for each)
		for (String s : arr1) {
			System.out.println(s);
		}

		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(33);
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(34);
		myNumbers.add(8);
		myNumbers.add(12);

		System.out.println("my array :" + myNumbers);

		Collections.sort(myNumbers); // Sort myNumbers

		for (int i : myNumbers) {
			System.out.println(i);
		}

	}
}
