package coll_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Coll_Example_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<String>names=new ArrayList<>();	
	names.add("mayeshwari");
	names.add("priyanka");
	names.add("aswini");
	names.add("pranjali");
	names.add("shital");
	names.add("yuganti");
	names.add("manisha");
	System.out.println("names:= " + names);
	System.out.println("get value:= "+names.get(4));
	System.out.println("contains:= "+names.contains("simmmu"));	
	System.out.println("size of:= "+names.size());
	//via iterator 
	System.out.println("-----------------iterator------------------------");
	Iterator<String>itr=names.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	//via forEach
	System.out.println("---------------for each-----------------------");
	for(String s:names) {
		System.out.println(s);
	}
	
	
		
		


		}

}
