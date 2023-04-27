package access;
//class Base {
//   final public void show() {
//       System.out.println("Base::show() called");
//    }
//}
//  
//class Derived extends Base {
//    public void show() {
//       System.out.println("Derived::show() called");
//    }
//}
  
public class Example{
   public static void main(String[] args) {
//        Base b = new Derived();;
//        b.show();
	int i = 0;
	for(i = 0; i < 10; i++){
		continue;
	}
	System.out.println(i);
    }
}