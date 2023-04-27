package java_8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(6,7,8,9,3);
		List<Integer>ditnict=numbers.stream().map(i->i*i)
				.distinct()
.collect(collectors.to)
				// TODO Auto-generated method stub
		List<String> strList = Arrays.asList("priyanka", "", "pooja", "shrya", "sikha");
		long count = strList.stream().filter(x -> x.isEmpty()).count();
		System.out.println("count :" + count);
		long num = strList.stream().filter(x -> x.length() > 3).count();
		System.out.println("count>3:" + num);
		System.out.println("Element whose length is > 3 and startswith d");
		strList.stream().filter(s -> s.length() > 3).filter(s -> s.startsWith("d"))
//.forEach(a -> System.out.println(a));
				.forEach(System.out::println);
		System.out.println("My Sorted Array");
		strList.stream().sorted().forEach(System.out::println);
	}

}
