package access;
class Vehicle{
	int speed=50;
}
class Bike extends Vehicle{
	int speed=100;
	void displaySpeed() {
		System.out.println(super.speed);
	}
}
public class Supers_key {
public static void main(String[] args) {
	Bike b=new Bike();
	b.displaySpeed();
}
}
