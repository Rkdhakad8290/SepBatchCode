package com.destination.septemberBatchProgram.sep25;

import java.util.Scanner;

public class Pattern7 {
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int n= sc.nextInt();
		int A = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++ ) {
			System.out.print(A+"	");
			A++;
			}
			System.out.println();
	}

}

}
