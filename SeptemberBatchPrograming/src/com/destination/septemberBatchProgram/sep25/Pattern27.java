package com.destination.septemberBatchProgram.sep25;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int n= sc.nextInt();
		int count =1;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				
				System.out.print("- ");
				}
			
			for(int j=1;j<=2*i-1;j++) {
				if(count<=2*i-1)
				System.out.print(count+" ");
				count++;
			}
			count=1;
			
			System.out.println();
		}
	}

}
