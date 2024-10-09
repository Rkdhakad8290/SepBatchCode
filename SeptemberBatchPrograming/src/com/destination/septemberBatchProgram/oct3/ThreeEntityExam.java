package com.destination.septemberBatchProgram.oct3;
import java.util.Scanner;

class ThreeEntityExam1{
	int arr[][][];
	int clg;
	int cls;
	int stu;
	Scanner sc= new Scanner(System.in);
	
	void createArray(int n,int m,int o){
		clg=n;
		cls=m;
		stu =o;
		arr= new int[clg][cls][stu];
		System.out.println(" Collecting college count for each college : ");
	/*
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("Enter the student  count inside class no : "+(i+1));
			 stu =  sc.nextInt();
			arr[i][j]= new int[stu];
			}
		
		}
		*/
		
		
		System.out.println("Array is created successfully");
		System.out.println("=======");
		
	}
	
	void addData() {
		System.out.println("Collecting array data :");
		for(int i=0;i<arr.length;i++) {
		System.out.println("Inside college no :"+(i+1));
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Inside class No : "+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("Enter the marks of student no : "+(k+1));
			arr[i][j][k] = sc.nextInt();
		}
	}
		}
		
		System.out.println("Marks successfully collected");
		System.out.println("===========");
}
	
	
	
	
	 void display() {
		 System.out.println("Display array data : ");
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("Inside college No : "+(i+1));
			 for(int j=0;j<arr[i].length;j++) {
				 System.out.println("inside class no : "+(j+1));
				 for(int k=0;k<arr[i][j].length;k++) {
					 System.out.println("the marks of student no : "+(j+1)+" is  "+arr[i][j][k]);

				 }
			 }
		 }
		 
		 
	 }
	
}

public class ThreeEntityExam {
	public static void main(String[] args) {
		
		ThreeEntityExam1 ad= new ThreeEntityExam1();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the college count :");
		int clg = sc.nextInt();
		System.out.println("Enter the college count :");
		int cls = sc.nextInt();
		System.out.println("Enter the student count :");
		int stu = sc.nextInt();
		
		ad.createArray(clg , cls , stu);
		ad.addData();
		ad.display();
		
	}

}
