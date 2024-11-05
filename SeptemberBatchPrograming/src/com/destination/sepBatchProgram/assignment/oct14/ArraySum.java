package com.destination.sepBatchProgram.assignment.oct14;
import java.util.Scanner;
class ArraySumEx{
	Scanner sc= new Scanner(System.in);
	int n;
	int arr[];
	int arraySum=0;
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
	void sum() {
		for(int i=0;i<n;i++) {
			arraySum+=arr[i];
		}
	}
	void display(){
		System.out.println("Sum of Array is  :"+arraySum);
	}

}
public class ArraySum {
	public static void main(String[] args) {
		ArraySumEx as= new ArraySumEx();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n= sc.nextInt();
		as.createArray(n);
		as.addData();
		as.sum();
		as.display();

	}

}
