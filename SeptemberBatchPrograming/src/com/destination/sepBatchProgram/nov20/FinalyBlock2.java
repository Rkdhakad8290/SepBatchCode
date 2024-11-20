package com.destination.sepBatchProgram.nov20;

import java.util.Scanner;

public class FinalyBlock2 {
	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the num1 :");
			int num1= sc.nextInt();
			System.out.println("Enter the num2 :");
			int num2= sc.nextInt();
			int res= num1/num2;
			System.out.println(res);
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("Exception handled ");
		}
		finally {
			System.out.println("Hii From Finally");
		}
	}

}
