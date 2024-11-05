package com.destination.sepBatchProgram.string.oct23;

import java.util.Scanner;

public class ProductSum {

	public static void main(String[] args) {
 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		int product=1;
		int sum=0;
		
		for(int i=0;i<str.length();i++) {
			product =product *str.charAt(i); 
			sum=sum+str.charAt(i);
		}
		System.out.println("Sum of "+sum+ " and  Product of "+product);
	}

}
