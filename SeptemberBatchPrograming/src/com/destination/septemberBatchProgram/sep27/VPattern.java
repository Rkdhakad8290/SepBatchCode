package com.destination.septemberBatchProgram.sep27;

import java.util.Scanner;

public class VPattern {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j && i<=n/2  
						|| j+i==n-1 && j>=n/2
						)
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
