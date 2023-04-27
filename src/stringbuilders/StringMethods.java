package stringbuilders;


public class StringMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a="hello";
      System.out.println(" lenght: "+a.length());
      System.out.println(" charat: "+a.charAt(4));
      System.out.println("To check blank:"+a.isBlank());
      System.out.println("uppercase: " +a.toUpperCase());
      System.out.println("lowercase: " +a.toLowerCase());
      System.out.println("startswith: "+a.startsWith("he"));
      System.out.println("endwith: " +a.endsWith("he"));
      String b = "Ajava";
      System.out.println("concate: "+a.concat(b));
      String c="ajavajava";
      System.out.println("equal: "+b.equals(c));
      System.out.println("equalignore: "+b.equalsIgnoreCase(c));
      System.out.println("compare to: "+c.compareToIgnoreCase(b));
      System.out.println("indexof: "+c.indexOf('j'));
      System.out.println("lastindexof: "+c.lastIndexOf('j'));
      String d= " java ";
      System.out.println("trim: "+d.trim());
	}

}
