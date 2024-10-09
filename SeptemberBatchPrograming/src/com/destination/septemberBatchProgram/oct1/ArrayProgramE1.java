package com.destination.septemberBatchProgram.oct1;
import java.util.Scanner;


	

 class ArrayProgram1 {
	int arr[];
	int size;
	
	void createArray(int n) {
		size=n;
		arr= new int[size];
		System.out.println("Array is created succesfully");
		System.out.println("==========");
		
		
	}
	
	void addData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Collection array Data");
		for(int i=0;i<size;i++) {
			System.out.println("Enter the marks of the Student no :"+(i+1));
			arr[i]= sc.nextInt();
		}
		System.out.println("Marks Succesfully Collected");
		System.out.println("===========");
	}
	void display() {
		System.out.println("Display array Data : ");
		for(int i=0;i<size;i++) {
			System.out.println("The marks of student no : "+(i+1)+" is = "+arr[i]);
		}
	}
	
}
 public class ArrayProgramE1 {
	 
	 public static void main(String[] args) {
			
			ArrayProgram1 ap= new ArrayProgram1();
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the count of student : ");
			int n= sc.nextInt();
			
			ap.createArray(n);
			ap.addData();
			ap.display();
			
			
		}
 }
	
