package com.destination.septemberBatchProgram.sep25;

import java.util.Scanner;

public class Pattern24 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Size");
		int n= sc.nextInt();
		int temp=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if( temp<10 )
				{
					System.out.print("0"+temp+" ");
				}
				else {
					System.out.print(temp+" ");
				}
			
			temp++;
			}
			System.out.println();
		}
	}


}
