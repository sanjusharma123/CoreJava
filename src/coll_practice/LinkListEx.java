package coll_practice;

import java.util.LinkedList;
import java.util.Vector;

public class LinkListEx {
public static void main(String[] args) {
	LinkedList<String>names1=new LinkedList<>();
	names1.add("priyanka");
	names1.add("mayeshwari");
	names1.add("aswini");
	names1.add("pranjali");
	names1.add("shital");
	names1.add("yuganti");
	names1.add("manisha");
	System.out.println("names:= "+ names1);
	
	LinkedList<String>names12=new LinkedList<>();
	names12.add("monkey");
	names12.add("mayeshwari");
	names12.add("aswini");
	names12.add("pranjali");
	names12.add("shital");
	names12.add("yuganti");
	names12.add("manisha");
	System.out.println(names1.addAll( 0,names12));
	
	
	
//	Vector<String>vector=new Vector<>();
//	System.out.println(vector.addAll(names1));
//	System.out.println("vector:= "+vector );
}
}
