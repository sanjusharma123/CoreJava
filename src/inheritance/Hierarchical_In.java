package inheritance;

class Animal3 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog3 extends Animal3 {
	void bark() {
		System.out.println("barking...");
	}
}

class Cat extends Animal3 {
	void meow() {
		System.out.println("meowing...");
	}
}

public class Hierarchical_In {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.meow();
		c.eat();
		// c.bark();//C.T.Error
	}

}
