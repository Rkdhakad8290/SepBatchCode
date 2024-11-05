package com.destination.sepBatchProgram.oct14;

import java.util.Scanner;

class MatrixMultiply{
	  Scanner sc= new Scanner(System.in);

	int[][] mat1;
	int[][] mat2;
	int n;
	int m;
	int[][]result;
   
	void createMat(int n1,int m1) {
		 n=n1;
		m=m1;
		mat1=new int[n][m];
		mat2 = new int[n][m];
		result= new int[n][m];
		System.out.println("Matrix Created successfully");

		
	}
	void collectData() {
		 System.out.println("Enter the Mat1 values :");
		for(int i=0;i<n;i++) {

			for(int j=0;j<m;j++) {

				mat1[i][j]=sc.nextInt();
			}
		}
		  System.out.println("Enter the Mat2 values :");

		for(int i=0;i<n;i++) {

			for(int j=0;j<m;j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
		System.out.println(" value added in Matrix successfully");

	}
	 void multiply() {
		  System.out.println("Multiplication of the matrix :");
		  

		 for(int i=0;i<n;i++) {

			for(int j=0;j<m;j++) {
				for(int k=0;k<n;k++) {
				

				result[i][j]+=mat1[i][k]*mat2[k][j];
			}
		}
		 }

		 
	 }
	 void display() {
		 for(int i=0;i<n;i++) {

				for(int j=0;j<m;j++) {

					System.out.print(result[i][j]+" ");
				}
				System.out.println();
			}
		 
	 }
	
}

public class MatrixMultiplyOps {
	
  public static void main(String[] args) {
	  MatrixMultiply ad = new MatrixMultiply();
	  Scanner sc= new Scanner(System.in);
	  
	  System.out.println("Enter the size of  row :");
	  int n= sc.nextInt();
	  System.out.println("Enter the size of  col:");
	  int m= sc.nextInt();
	  
	  ad.createMat(n, m);
	  ad.collectData();
	  ad.multiply();
	  ad.display();
	  
//	  System.out.println("Enter the size of M2 row :");
//	  int n2= sc.nextInt();
//	  System.out.println("Enter the size of M2 col:");
//	  int m2= sc.nextInt();
	  
	  
	  
	  
	
}

}

