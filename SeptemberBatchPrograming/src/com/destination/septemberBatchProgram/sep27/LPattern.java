package com.destination.septemberBatchProgram.sep27;

import java.util.Scanner;

public class LPattern {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if( j==n/4 && i<=3*n/4
						|| i==3*n/4 && j>=n/4 && j<=(3*n/4))
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
