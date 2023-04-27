package com;

public class Sorting {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[] {10,100,50,1,75};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
		int temp=0;
		if(arr[i]<arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
			}
		}
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
	}

}
