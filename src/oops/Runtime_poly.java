package oops;

abstract class Animal {
	abstract void walk();
}

class Horse extends Animal {
	public void walk() {
		System.out.println("horse is eating");
	}
}

class Cat extends Animal {
	void walk() {
		System.out.println("cat is walking");
	}
}

public class Runtime_poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse h1 = new Horse();
		h1.walk();
		Cat c1 = new Cat();
		c1.walk();
		Animal a1 = new Horse();// we cannot create a object of abstract class
		a1.walk();
	}

}
