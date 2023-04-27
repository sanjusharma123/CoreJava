package collection_framework;
import java.util.*;
public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer>h1=new HashSet<Integer>();
h1.add(12);
h1.add(3);
h1.add(6);
h1.add(5);
HashSet<Integer>h2=new HashSet<Integer>();
h2.add(2);
h2.add(1);
h2.add(6);
h2.add(7);
//h1.addAll(h2);//union
System.out.println("H1 Set:- "+ h1);
System.out.println("H2 Set:- "+ h2);
//System.out.println(h2.retainAll(h1));//Intersection(take common element);
System.out.println(h2.removeAll(h1));//Intersection(removeAll common element);
System.out.println("H1 set :" + h1);
System.out.println("H2 Set:- "+ h2);
	}

}
