package com.destination.septemberBatchProgram.sep27;
/*
  # # #         # #       #     #     #     #     #           
  #     #     #     #     #     #     #     #     #           
  #     #     #     #     #     #     #     #     #           
  # # # #     # # # #     # # # #     #     #     #           
  #       #   #     #     #     #     #     #     #           
  #         # #     #     #     #       # #       # # # #     

 */

import java.util.Scanner;

public class NamePattern {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			// FOR - R
			for(int j=0;j<n;j++) {
				if(i==0 && j<n/2
						|| j==0 && i!=0  && j!=n/2
						|| i==n/2  && j<n/2
						||j==n/2 && i!=0 && i<n/2
						||i==j && i>=n/2 && j>=n/2)
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
				
				
			}
			
			// FOR - A
			for(int j=0;j<n;j++) {
				if(i==0 && j!=0 && j<n/2
						|| j==0 && i!=0  && j!=n/2
						|| i==n/2  && j<n/2
						||j==n/2 && i!=0  )
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			// FOR - H
			for(int j=0;j<n;j++) {
				if( j==0 && j!=n/2
						|| i==n/2  && j<n/2
						||j==n/2  )
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			// FOR - U
			for(int j=0;j<n;j++) {
				if( j==0 &&  j!=n/2 && i!=n-1
						||j==n/2 &&i!=n-1
						|| i==n-1 && j!=0 && j<n/2)
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			// FOR - L
			for(int j=0;j<n;j++) {
				if( j==0 && j!=n/2
				    || i==n-1 && j<=n/2)
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
	}


}
