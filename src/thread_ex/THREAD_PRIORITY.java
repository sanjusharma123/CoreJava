package thread_ex;

public class THREAD_PRIORITY extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// System.out.println("my thread is running");
		System.out.println(Thread.currentThread());

	}

	public static void main(String[] args) {
		THREAD_PRIORITY tp = new THREAD_PRIORITY();
		Thread t1 = new Thread(tp, "Mythread1");

		Thread t2 = new Thread(tp, "Mythread2");
		
		Thread t3 = new Thread(tp, "Mythread3");
		t1.setPriority(4);
		t2.setPriority(1);
		t3.setPriority(3);

		t1.start();
//		System.out.println("priority: " + t1.getPriority());
//		System.out.println("Name of thread: " + t1.getName());
		t2.start();
//		System.out.println("priority: " + t2.getPriority());
//		System.out.println("Name of thread: " + t2.getName());
		t3.start();
//		System.out.println("priority: " + t3.getPriority());
//		System.out.println("Name of thread: " + t3.getName());
		System.out.println("Thread MinPriority : " + Thread.MIN_PRIORITY);
		System.out.println("Thread MaxPriority : " + Thread.MAX_PRIORITY);
		System.out.println("Thread NormPriority : " + Thread.NORM_PRIORITY);
	}

}
