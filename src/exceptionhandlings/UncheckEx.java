package exceptionhandlings;

public class UncheckEx {

	public static void main(String[] args) {
		//normal code
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		// ArithmeticException: / by zero
		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println(c);

		} catch (Exception e) {
			System.out.println("ArithmeticException: / by zero");
		}
		// ArrayIndexOutOfBoundsException
		try {
			int arr[] = { 1, 2 };
			System.out.println(arr[6]);
		} catch (Exception e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} finally {
			System.out.println("this blocked run every time");
		}

	}

}
