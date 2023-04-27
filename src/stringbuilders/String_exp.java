package stringbuilders;

import java.util.Scanner;

public class String_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name:-");
String Name=sc.next();
System.out.println("Enter Surname:-");
String Surname=sc.next();
String FullName=sc.nextLine();
FullName=Name+ " "+Surname;

System.out.println(Name.compareTo(Surname));//comparing ascii avlue of 1st char to 2nd char

//********************************************STRING CONCATIONATION METHOD****************************************
//System.out.println("FullName is:- "+Name + " "+Surname+" "+FullName);

//********************************************CHAR AT METHOD+length******************************************************

System.out.println("FullName is:- "+Name + " "+Surname+" "+FullName.length());
/*
for(int i=0;i<FullName.length();i++) {
	System.out.println(FullName.charAt(i));
}*/
//*********************************************COMPARE TO********************************************************************
//if(new String("sanju")==new String("sanju")) {
//System.out.println("equal");
//		
//	}else {
//		System.out.println("not equal");
//	}

//*****************************************************UPPERCASE LOWERCASE*********************************************************
//System.out.println("fullName is:- "+FullName.toUpperCase());
//System.out.println("fullName is:- "+FullName.toLowerCase());
sc.close();
	}
	}
