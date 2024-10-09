package com.destination.septemberBatchProgram.oct1;

import java.util.Scanner;

class ArrayExample{
	int arr[][];
	int cls;
	int stu;
	
	void createArray(int n , int m) {
		cls=n;
		stu=m;
		arr= new int[cls][stu];
		System.out.println("Array is created succesfully");
		System.out.println("==========");
		
		
	}
	
	void addData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Collection array Data");
		for(int i=0;i<cls;i++) {
			System.out.println("Inside class no :"+(i+1));
			
				for(int j=0;j<stu;j++) {
					
				System.out.println("Enter the marks of number : "+(j+1));
			
			arr[i][j]= sc.nextInt();
			}
		}
		System.out.println("Marks Succesfully Collected");
		System.out.println("===========");
	}
	
	void display() {
		System.out.println("Display array Data : ");
		for(int i=0;i<cls;i++) {
			System.out.println("Inside class no : "+(i+1));
			
		
		for(int j=0;j<stu;j++) {
			System.out.println("The marks of student no : "+(j+1)+" is = "+arr[i][j]);
			
		}
	}
}
}

public class ArrayProgram2 {
	public static void main(String[] args) {
		ArrayExample ae= new ArrayExample();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the class count : ");
		int cls= sc.nextInt();
		System.out.println("Enter the student count : ");
		int stu = sc.nextInt();
		
		ae.createArray(cls,stu);
		ae.addData();
		ae.display();
		
		
	}

}
