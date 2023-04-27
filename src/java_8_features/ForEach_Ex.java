package java_8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> names = new ArrayList<>();
//		names.add("pari");
//		names.add("ayusi");
//		names.add("shital");
//		names.add("pranjali");
//		names.add("sikha");
//		System.out.println("List : " + names);
//		names.forEach(add -> System.out.println(add));
//		System.out.println("///////Without lambda Expression////");
//
//		for (String string : names) {
//			System.out.println(string);
			List<String> list = Arrays.asList("Virat", "Ricky", "Peterson", "Watson", "Sachin");
			String names1 = String.join(" | ", list);
			System.out.println(names1);

		}
	}

//}
