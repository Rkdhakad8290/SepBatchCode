package com.destination.septemberBatchProgram.sep25;
/* 
 *  Trainer is  good
 */

import java.util.Scanner;

public class Review {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			//For -T
			for(int j=0;j<n;j++) {
				if(i==0 && j>=n/4 && j<=3*n/4
						||j==n/2 
						)
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			
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
			
			
			for(int j=0;j<n;j++) {
				if( i==0 && j>=(n/4) && j<=(3*n/4)
						||j==n/2 
						|| i==n-1 && j>=(n/4) && j<=(3*n/4))
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			for(int j=0;j<n;j++) {
				if( j==0 || i==j || j==n-1)
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			
			
			for(int j=0;j<n;j++) {
				if(i==0 && j<=n/2
						|| j==0 
						|| i==n/2  && j<=n/2
						
						|| i==n-1 && j<=n/2 )
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			
			
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
			
			//for-I
			for(int j=0;j<n;j++) {
				if( i==0 && j>=(n/4) && j<=(3*n/4)
						||j==n/2 
						|| i==n-1 && j>=(n/4) && j<=(3*n/4))
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			//For -s
			for(int j=0;j<n;j++) {
				if(i==0 && j<=n/2 && j!=0
						|| j==0 && i<n/2 && i!=0
						|| i==n/2  && j<n/2 &&j!=0
						
						|| i==n-1 && j<n/2  
						|| j==n/2 && i>n/2 && i!=n-1 )
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			// for -G
			for(int j=0;j<n;j++) {
				if(i==0 && j!=0 && i!=n-1
						|| j==0 && i!=0 && i!=n-1
						|| j==n/2  && i>n/2  && i!=n-1
						|| i==n-1 && j<n/2  && j!=0
						|| i==n/2 && j>n/2 && j!=n-1
						|| j==n-1 && i>n/2 )
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			// for - O

			for(int j=0;j<n;j++) {
				if(i==0 && j<3*n/4 && j!=0
						|| j==0 && i!=0  && i<3*n/4
						|| i==3*n/4  && j<3*n/4 && j!=0
						||j==3*n/4 && i!=0 && i<3*n/4
						)
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
				
				
			}
			
			//for - O

			for(int j=0;j<n;j++) {
				if(i==0 && j<3*n/4 && j!=0
						|| j==0 && i!=0  && i<3*n/4
						|| i==3*n/4  && j<3*n/4 && j!=0
						||j==3*n/4 && i!=0 && i<3*n/4
						)
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			// For - D
			for(int j=0;j<n;j++) {
				if(i==0 && j<n/2
						|| j==0 && i!=0  && j!=n/2
						
						||j==n/2 && i!=0 && i!=n-1 
						|| i==n-1 && j<n/2)
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
