package oops;

public class Abstracts_And_Non {
public static void main(String[] args) {
	Audi a1 =new Audi();
	a1.start();

	Bmw b1=new Bmw();
	b1.start();
	a1.speed();
}
}


class Audi extends Car{
int price=10000;
	@Override
	void start() {
		System.out.println("Audi car is started heheeeooo");
		System.out.println("price of the Audi "+price);
		
	}
	
}
class Bmw extends Car{
	int price=230000;
	void start() {
		System.out.println("Bmw car is started heheeeeoooo");
		System.out.println("price of the Bmw is: "+price);
	}
}
abstract class Car{
	int price;
	abstract void start();
	
	public void speed() {
		System.out.println("the speed of the car is :- " +1000);
	}
}
