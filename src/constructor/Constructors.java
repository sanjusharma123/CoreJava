package constructor;

import java.util.Scanner;

class Student {
	int id;
	String name;

	Student(int i, String nm) {
		id = i;
		name = nm;
	}

	void display() {
		System.out.println("id: " + id);
		System.out.println("name: " + name);
	}
}

public class Constructors {

	public static void main(String[] args) {
		

		// get values from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id and name");
		int id = sc.nextInt();
		
		String name = sc.next();
		
		Student s = new Student(id, name);

		s.display();
		
		//parameterized constructor
				Student s1=new Student(12,"guddu");
				s1.display();
				
				//copy constructor
				Student s2=(s1);
				s2.display();
		
		sc.close();

	}

}