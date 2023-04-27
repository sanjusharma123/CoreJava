package access;
class Student1 {
	   String name="sanju";
	   int age=21;
	  
	   Student1() {
	       System.out.println("Constructor called");
	   }
	}

public class Fun {
public static int add(int a,int b) {
	return a+b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(add(2,4));
System.out.println(add(8,4));
System.out.println(add(6,4));

	}

}
