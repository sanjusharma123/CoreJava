package methods;
class Cal{
	public int add(int num1,int num2) {
		return  num1+ num2;
	}
}
class Cal1 extends Cal{
	public int add(int num1,int num2) {
		return num1+num2+1;
	}
}
public class MethodsOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cal1 obj=new Cal1();
int n1=obj.add(1,3);
System.out.println(n1);
	}

}
