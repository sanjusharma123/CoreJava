package collection_framework;
import java.util.*;
public class QueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<Integer> value=new ArrayDeque<>();
value.add(1);
value.add(2);
value.add(3);
//Note here addLast and offerLast doing same thing like adding element at the end of list
System.out.println(value);
System.out.println(" offerFirst:- "+value.offerFirst(17));//
System.out.println("offerLast :- "+value.offerLast(17));//
value.addFirst(17);
System.out.println(value);//add 1st Position
value.addLast(5);
System.out.println(value);
	}

}
