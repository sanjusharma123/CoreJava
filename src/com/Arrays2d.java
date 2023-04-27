package com;

import java.util.Scanner;

public class Arrays2d {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter values:-");
	int row=sc.nextInt();
	int col=sc.nextInt();
	int number[][]=new int[row][col];
	int number1 [][]=new int[row][col];
	int i,j = 0;
	for(i=0;i<row;i++) {
		for(j=0;j<col;j++) {
		number[i][j]=sc.nextInt();	
		}
	}
	for(i=0;i<row;i++) {
		for(j=0;j<col;j++) {
	   System.out.print(number[i][j]+" ");	
		}
		System.out.println();
	}
	for(int k=0;k<row;k++) {
		for(int l=0;l<col;l++) {
		number[k][l]=sc.nextInt();	
		}
	}
	for(int k=0;k<row;k++) {
		for(int l=0;l<col;l++) {
	   System.out.print(number[i][j] + number[k] [l]);	
		}
		System.out.println();
	}
	for(i=0;i<row;i++) {
		for(j=0;j<col;j++) {
		number1[i][j]=sc.nextInt();	
		}
	}
	for(i=0;i<row;i++) {
		for(j=0;j<col;j++) {
	   System.out.print(number1[i][j]+" ");	
		}
		System.out.println();
	}
	for(int k=0;k<row;k++) {
		for(int l=0;l<col;l++) {
		number1[k][l]=sc.nextInt();	
		}
	}
	for(int k=0;k<row;k++) {
		for(int l=0;l<col;l++) {
	   System.out.print(number[i][j] + number1[k] [l]);	
		}
		System.out.println();
	}

}
}
