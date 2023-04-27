package exceptionhandlings;

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}

}

public class UsersDefineVote {

	public void checkedage(int age) throws MyException {

		if (age < 18) {
			throw new MyException("Invalid Age For Age");
		} else {
			System.out.println("Welcome For Vote");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsersDefineVote u = new UsersDefineVote();

		int age = 23;
		try {
			u.checkedage(age);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
