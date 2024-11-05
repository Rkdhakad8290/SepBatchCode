package com.destination.sepBatchProgram.oct14;

import java.util.Scanner;
class DiagnolMat{
	  Scanner sc= new Scanner(System.in);

		int[][] mat;
		
		int n;
		int m;
	   
		void createMat(int n1,int m1) {
			 n=n1;
			m=m1;
			mat=new int[n][m];
			System.out.println("Matrix Created successfully");

			
		}
		void collectData() {
			 System.out.println("Enter the Mat1 values :");
			for(int i=0;i<n;i++) {

				for(int j=0;j<m;j++) {

					mat[i][j]=sc.nextInt();
				}
			}
			 
			

		}
		 public boolean isDiagonalMatrix(int[][] matrix, int n,int m) {
		       
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < m; j++) {
		               
		                if (i != j && matrix[i][j] != 0) {
		                    return false; 
		                }
		            }
		        }
		        return true; 
		    }
		
		 void display() {
			 if (isDiagonalMatrix(mat, n,m)) {
		            System.out.println("The matrix is a diagonal matrix.");
		        } else {
		            System.out.println("The matrix is NOT a diagonal matrix.");
		        
			 }
			 
		 }
		
}

public class DiagnoalMatrix {
	public static void main(String[] args) {
		 DiagnolMat ad = new DiagnolMat();
		  Scanner sc= new Scanner(System.in);
		  
		  System.out.println("Enter the size of  row :");
		  int n= sc.nextInt();
		  System.out.println("Enter the size of  col:");
		  int m= sc.nextInt();
		  
		  ad.createMat(n, m);
		  ad.collectData();
		  ad.display();
	}

}
