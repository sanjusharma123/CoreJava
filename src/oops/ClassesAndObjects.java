package oops;

public class ClassesAndObjects {
	public static void main(String[] args) {

		// default constructor
		Person p1 = new Person();
		p1.age = 23;
		p1.name = "sanjukumari sharma";

		// default constructor
		Person p2 = new Person();
		p2.age = 16;
		p2.name = "shitala";

		// Parameterized constructor
		Person p3 = new Person(21, "saniya");

		//copy constructor
		Person p4=(p2);
		p4.walk();
		

//printing the output
		System.out.println(p1.name + " " + p1.age);
		System.out.println(p2.name + " " + p2.age);
		System.out.println(p3.name + " " + p3.age);
		System.out.println(Person.count);
		// Methods or Functions
		p1.walk();
		p1.walk(34);
		p2.eat();
	}
}

class Person {
	String name;
	int age;
	static int count;

	// here in this example this is used for overloading the constructor
	public Person(int age, String name) {
		this();
		this.age = age;
		this.name = name;
	}

	// way to know how much constructor are generated
	public Person() {
		count++;
		System.out.println("constructored is  called");
	}

	// methods declarations
	void walk() {
		System.out.println(name + " is walking");
	}

	void eat() {
		System.out.println(name + " is eating");
	}

	void walk(int step) {
		System.out.println(name + " is walking " + step + " steps");
	}

}
