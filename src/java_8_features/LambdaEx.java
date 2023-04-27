package java_8_features;

public interface LambdaEx {
		void demo();
		void msg1();

		static void msg() {
			System.out.println("hello");
		}

		default void display() {
			System.out.println("default");
		}

	}


