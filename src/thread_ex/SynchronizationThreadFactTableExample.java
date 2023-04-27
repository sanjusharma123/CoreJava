package thread_ex;

import java.util.Scanner;

class Factorial extends Thread {
	int factorialNumber = 0;

	public Factorial(int fact) {
		this.factorialNumber = fact;
	}

	public void run() {
		int j = findFacto(factorialNumber);
		System.out.println("Factorial is:" + j);
	}

	synchronized public int findFacto(int number) {
		int i, fact = 1;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}
}

class Table extends Thread {
	int num = 0;

	public Table(int num) {
		this.num = num;
	}

	public void run() {
		Table(num);
	}
	// private void createTable(int num2) {

	// }
	synchronized public void Table(int number) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));

		}
	}

}

public class SynchronizationThreadFactTableExample {

	public static void main(String[] args) {
		Factorial f = new Factorial(3);
		f.start();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers To Print Table: ");
		int number = sc.nextInt();
		int number1 = sc.nextInt();

		System.out.println("\n\nTable is\n\n:" + number);
		Table t = new Table(number);

		t.start();
//System.out.println("*************************************");

		System.out.println("\n\nTable is\n\n:" + number1);
		Table t1 = new Table(number1);

		t1.start();

	}

}
