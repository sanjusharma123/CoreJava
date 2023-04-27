package thread_ex;

class Table1 {
	synchronized void printTable(int n) // Here, method is synchronized.
	{
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
		}
	}
}

class Thread11 extends Thread {
	Table1 t; // Declaration of variable t of class type Table.

// Declare one parameterized constructor and pass variable t as a parameter.
	Thread11(Table1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class Thread22 extends Thread {
	Table1 t;

	Thread22(Table1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(10);
	}
}

public class SynchronizedMethod {
	public static void main(String[] args) {
// Create an object of class Table.	
		Table1 obj = new Table1();
		Thread11 t1 = new Thread11(obj);
		Thread22 t2 = new Thread22(obj);
		t1.start();
		t2.start();
	}
}
