package practice;

public class MethodWithBooleanAnd_return1 {
	//method with return type Boolean and passing two parameter
	
	public boolean checkEquality(int a,int b) {
		if(a==b) {
			return true;
		}
		else {
			 return false;
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodWithBooleanAnd_return1 mb=new MethodWithBooleanAnd_return1();
System.out.println(mb.checkEquality(3, 3));
	}

}
