package com.destination.sepBatchProgram.nov14;

import java.util.Scanner;

public class ExceptionHandles1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
		System.out.println("Enter the numerator: ");
		int num = sc.nextInt(); // critical statement
		System.out.println("Enter the denominator: ");
		int den = sc.nextInt(); // critical statement
		
		int res = num / den; // critical statement
		
		System.out.println(res);
		}
		catch (Exception e) {
			System.out.println("Exception Handled");

		}
	}

}

