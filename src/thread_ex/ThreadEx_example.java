package thread_ex;

class ExtendsThread1 extends Thread {
	public void run() {
		for (int i = 10; i <= 15; i++) {
			System.out.println(i);
		}
	}
}

class ExtendsThread3 extends Thread {
	public void run() {
		for (int i = 11; i <= 15; i++) {
			System.out.println(i);
		}
	}
}

class ExtendsThread2 extends Thread {
	static ExtendsThread2 st;

	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			if (i == 2) {
				st.stop();

			}
		}
	}
}

public class ThreadEx_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendsThread1 et = new ExtendsThread1();
		ExtendsThread2 st = new ExtendsThread2();
		st.start();
		et.start();
	}

}