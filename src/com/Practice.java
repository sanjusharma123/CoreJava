package com;

public class Practice {
public static void main(String[] args) {
	/*
	int num[]= {6,6,8,9};
	int sum=0;
	for(int element:num) {
		sum+=element;
	}
	System.out.println(sum);
	*/
	//find values
	/*int numbers[]= {6,6,8,9};
	int num=90;
	boolean isInArray=false;
	for(int element:numbers) {
		if(num==element) {
			isInArray=true;
			break;
		}
	}
	if (isInArray) {
		System.out.println("value is present in array" );
	}
	else {
		System.out.println("value is not present");
	}
	*/
	float num[]= {6.0f,6.8f,8.67f,9.798f};
	float sum=0;
	for(float element:num) {
		sum+=element;
	}
	System.out.println("the average sum of values is "+sum/num.length);
	
	
	
}
}
