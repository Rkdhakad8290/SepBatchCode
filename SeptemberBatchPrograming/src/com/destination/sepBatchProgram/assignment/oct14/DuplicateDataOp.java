package com.destination.sepBatchProgram.assignment.oct14;
import java.util.Scanner;

class DuplicateArray{
	Scanner sc= new Scanner(System.in);
	int n;
	int arr[];
	int[] dup;
    int index =0;
	void createArray(int n1) {
		n=n1;
		arr = new int[n];
		dup = new int[n];
		System.out.println("Array create Successfully");
	}
	void addData() {
		System.out.println("Enter the array values : ");
		for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		}
	}
	void duplicate() {
		 index=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				 if (arr[i] == arr[j] && !isDuplicate(arr[i])) {
	                    dup[index++] = arr[i];
	                    break; 
	                }
			}
			
		}
	}
	 boolean isDuplicate(int value) {
	        for (int i = 0; i <index; i++) {
	            if (dup[i] == value) {
	                return true;
	            }
	        }
	        return false;
	    }
	 
	void display(){
		 if (index == 0) {
	            System.out.println("No duplicates found.");
	        } else {
	            System.out.println("Duplicate values are: ");
	            for (int i = 0; i < index; i++) {
	                System.out.print(dup[i] + " ");
	            }
		
	}
	
	
}
}

public class DuplicateDataOp {
	public static void main(String[] args) {
		DuplicateArray da= new DuplicateArray();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n= sc.nextInt();
		
		da.createArray(n);
		da.addData();
		da.duplicate();
		da.display();
	}

}
