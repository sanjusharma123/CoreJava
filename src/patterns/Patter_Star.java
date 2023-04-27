package patterns;

import java.util.Scanner;

public class Patter_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		System.out.println("enter any number:-"); 
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println();
	}
	
	}
}