package com;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayName {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value:");
		int n = sc.nextInt();
		String names[] = new String[n];
		//input from user
		System.out.println("enter name:");
		for (int i = 0; i < names.length; i++) {
			names[i] = sc.next();

		}
		//output
		System.out.println(" number of element:");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);

		}
		//sort array
		Arrays.sort(names);
	
		System.out.println(" sorting  element:");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);

		}
		

	}
}
