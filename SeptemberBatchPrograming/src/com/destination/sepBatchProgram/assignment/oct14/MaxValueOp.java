package com.destination.sepBatchProgram.assignment.oct14;
import java.util.Scanner;

class MaxValue{
	
		Scanner sc= new Scanner(System.in);
		int n;
		int arr[];
		int maxValue;
		void createArray(int n1) {
			n=n1;
			arr = new int[n];
			maxValue = arr[0];
			System.out.println("Array create Successfully");
		}
		void addData() {
			System.out.println("Enter the array values : ");
			for(int i=0;i<n;i++) {
				 arr[i]=sc.nextInt();
			}
		}
		void Max() {
			for(int i=0;i<n;i++) {
				if(maxValue<arr[i])
				maxValue=arr[i];
			}
		}
		void display(){
			System.out.println("Max value of Array is  :"+maxValue);
		}
		
	
}

public class MaxValueOp {

	public static void main(String[] args) {
		MaxValue mv =new MaxValue();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n= sc.nextInt();
		
		mv.createArray(n);
		mv.addData();
		mv.Max();
		mv.display();
	}

}
