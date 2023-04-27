package practice;

public class MethodWithBooleanAnd_return {

	public MethodWithBooleanAnd_return(boolean b) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodWithBooleanAnd_return mb = new MethodWithBooleanAnd_return(true);
		MethodWithBooleanAnd_return mb1 = new MethodWithBooleanAnd_return(true);
		if (mb.equals(mb1)) {
			System.out.println("equals method return true");

		}
		else {
		System.out.println("method returns false");	
		}
	}

}
