package oops;

class Calculator{
	public int add(int n1,int n2) {
		return n1+n2;
		
	}//same parameter
	public double add(double n1,int n2,double n3) {
		return n1+n2+n3;
	}//different parameter
	public int add(int n1,int n2,int n3,int n4,int n5) {
		return n1+n2;
	}//wrong 
}
public class CompileTime_Poly {
public static void main(String[] args) {
	Calculator obj=new Calculator();
	int num1=obj.add(4, 5);
	System.out.println(num1);
	double num2= obj.add(4.0, 5,9.0);
	System.out.println(num2);
	int n3=obj.add(3, 5);
	System.out.println(n3);
}
}
