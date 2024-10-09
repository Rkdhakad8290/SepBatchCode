package com.destination.septemberBatchProgram.sep25;

import java.util.Scanner;

public class Pattern25 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int n= sc.nextInt();
		char c='A';
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
					System.out.printf(c+" ");
			c++;
			}
			System.out.println();
		}
	}

}
