package stringbuilders;

public class CompareToEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java compareTo() method example";
	    String str1 = "Java compareTo() method example";
	    String str2 = "this is Java compareTo() method example";
	    String str3 = "Java CompareTo() Method Example";
	    String str4 = "a Java compareTo() method example";
	    String str5 = new String("Java compareTo() method example");

	    // comparing the str and str1 strings
	    System.out.println(str.compareTo(str1));

	    // comparing the str and str2 strings
	    System.out.println(str.compareTo(str2));

	    // comparing the str and str3 strings
	    System.out.println(str.compareTo(str3));

	    // comparing the str and str4 strings
	    System.out.println(str.compareTo(str4));

	    // comparing the str string and str5 string object
	    System.out.println(str.compareTo(str5));
	
//	String str1 = "Learn Java";
//	    String str2 = "Learn Java";
//	    String str3 = "Learn Kolin";
//	    int result;
//
//	    // comparing str1 with str2
//	    result = str1.compareTo(str2);
//
//	    System.out.println(result);  // 0
//
//	    // comparing str1 with str3
//	    result = str1.compareTo(str3);
//
//	    System.out.println(result);  // -1
//
//	    // comparing str3 with str1
//	    result = str3.compareTo(str1);
//
//	    System.out.println(result);  // 1
	}

}
