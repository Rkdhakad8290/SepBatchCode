package com.destination.sepBatchProgram.nov15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsHandling3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
		System.out.println("Enter the numerator: ");
		int num = sc.nextInt(); // critical statement --> InputMistMatchException
		System.out.println("Enter the denominator: ");
		int den = sc.nextInt(); // critical statement --> InputMistMatchException
		
		int res = num / den; // critical statement --> ArithmeticException
		
		System.out.println(res);
		System.out.println("Division Operation Started");
		
		System.out.println("========================");
		
		System.out.println("Array Operation started");
		System.out.println("Enter the array size :");
		int size = sc.nextInt();  // critical statement --> InputMistMatchException
		
		int arr[]= new int[size];  // critical statement --> NegativeArraySizeException
		System.out.println("enter the position number to add the data");
		int pos = sc.nextInt();  // critical statement --> InputMistMatchException
		System.out.println("enter the value to be added: ");
		int val = sc.nextInt();  // critical statement --> InputMistMatchException
		
		arr[pos]=val;  // critical statement --> ArrayIndexOutOfBoundsException
		
		System.out.println("data added");
		System.out.println("Array Operation Completed");
		
		
		}
		
		//specific catch blocks
		catch(ArithmeticException e1) {
			System.out.println("Arithmetic Exception is generated");
		}
		catch(InputMismatchException e2) {
			System.out.println(" Input MisMatch Exception is generated");
		}
		//Multi-catch blocks --> combine multiple exception in one
		catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e3) {
			System.out.println(" Negetive Array Size Exception or Array Index Out Of Bounds Exception is generated");
		}
		
	
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
