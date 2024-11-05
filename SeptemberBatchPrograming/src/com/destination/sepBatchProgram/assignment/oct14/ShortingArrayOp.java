package com.destination.sepBatchProgram.assignment.oct14;

import java.util.Scanner;

class ShortingArray{
	Scanner sc= new Scanner(System.in);
	int n;
	int arr[];
	
	void createArray(int n1) {
		n=n1;
		arr = new int[n];
		System.out.println("Array create Successfully");
	}
	void addData() {
		System.out.println("Enter the array values : ");
		for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		}
	}
	void asendingSorted() {
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
				int temp =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
	}
	void display(){
		System.out.println("asendingSorted  Array is  :");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		
	}
	
}

public class ShortingArrayOp {

	public static void main(String[] args) {
		ShortingArray sa = new ShortingArray();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n= sc.nextInt();
		
		sa.createArray(n);
		sa.addData();
		sa.asendingSorted();
		sa.display();

	}

}
