package oops;
abstract class AbstractDemo { 
	   
	   public void msg() { // non-abstract method
	      System.out.print("Abstact class with non abstract method");
	   }
	}
public class NonAbstractMethod_pg extends AbstractDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDemo demo = new NonAbstractMethod_pg();
	      demo.msg();
	}

	

}
