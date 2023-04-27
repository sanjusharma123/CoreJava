package collection_framework;
import java.util.*;
public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> names=new TreeSet<>();
names.add("simran");
names.add("aikha");
names.add("pranjali");
names.add("pranjali");//repetation not allowed;
names.add("uma");
System.out.println(names);

names.first();
System.out.println("first value: "+names.first());
String last=names.last();
System.out.println("last value: "+last);

System.out.println("Higher :" + names.higher("pranjali"));//Print next element
System.out.println("lower :" + names.lower("pranjali"));//before or previous element
System.out.println("pollFirst :" + names.pollFirst());//remove first element
System.out.println(names);
System.out.println("pollLast :" + names.pollLast());//remove last element
System.out.println(names);
	}

}
