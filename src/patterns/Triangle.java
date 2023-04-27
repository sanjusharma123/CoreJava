package patterns;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println("enter 1st number");
int b=sc.nextInt();
System.out.println("enter 2st number");
int c=sc.nextInt();
System.out.println("enter 3st number");
if(a<10 && a>0) {
	for(int i=1;i<=a;i++) {
		for(int j=1;j<a;j++) {
			System.out.println(" ");
			System.out.print(i);
			System.out.println("*");
		}
		for(int k=1;k<=i;k++) {
			System.out.println(k+" ");
		}
		System.out.println("");
	}
}
if(b<10 && b>0) {
	for(int i=1;i<=b;i++) {
		for(int j=1;j<b;j++) {
			System.out.println(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.println(k+" ");
		}
		System.out.println("");
	}
}
if(c<10 && c>0) {
	for(int i=1;i<=c;i++) {
		for(int j=1;j<c;j++) {
			System.out.println(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.println(k+" ");
		}
		System.out.println("*");
	}
}

	}


}
