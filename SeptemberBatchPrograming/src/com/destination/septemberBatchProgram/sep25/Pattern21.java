package com.destination.septemberBatchProgram.sep25;
/*
 *  - * * * * * * * * *
 *  - - * * * * * * * 
 *  - - - * * * * *
 *  - - - -  * * *
 *  - - - - - *
 */

import java.util.Scanner;

public class Pattern21 {
	
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int n= sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=0;j<=n-i;j++) {
				
				System.out.print("- ");
				}
			 for (int j= 1;j<=2*i-1;j++) {
				 
	                System.out.print("* ");
	            
			 }

			
			System.out.println();
		}
 }

	

}
