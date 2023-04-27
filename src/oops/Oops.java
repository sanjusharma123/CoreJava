package oops;

public class Oops {
	
	void add(int a,int b)
	{
		System.out.println("addition: "+(a+b));
	}
	void  subtract(int a,int b)
	{
		System.out.println("subract: "+(a-b));
	}
	int multiply(int a,int b)
	{
		return a*b;
	}
	String msg(String name)
	{
		return "Hello "+name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oops c=new Oops();
		c.add(12, 3);
		c.subtract(12,3);
		System.out.println("Multiplication: "+c.multiply(12, 3));
		int m=c.multiply(12, 3);
		System.out.println("Multiply: "+m);
		System.out.println(c.msg("Sanju"));
		
	}

}