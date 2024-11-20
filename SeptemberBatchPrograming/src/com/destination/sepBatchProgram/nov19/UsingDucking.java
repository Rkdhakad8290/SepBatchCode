// Ducking of exception 
package com.destination.sepBatchProgram.nov19;

import java.util.Scanner;

class Operations1{
	void function1(){
		System.out.println("Enterd Function-3");
		Scanner sc= new Scanner(System.in);
		System.out.println("Arithmetic Operation started");
		System.out.println("Enter the numerator : ");
		int num= sc.nextInt();
		System.out.println("Enter the denominator : ");
		int den= sc.nextInt();
		
		int res = num/den;
		System.out.println(res);
		System.out.println("Left Function-1");

		
	}
}

class Operations2{
	void function2() {
		try {
		System.out.println("Entered Function-2");
		Operations1 op1= new Operations1();
		op1.function1();
		System.out.println("Left Function-2");
		}
		catch(Exception e) {
			System.out.println("Exception handled in function-2");
			System.out.println("Left Function-2");
		}
	}
}
class Operations3{
	void function3() {
		try {
			
		
		System.out.println("Entered Function-1");
		Operations2 op2= new Operations2();
		op2.function2();
		System.out.println("Left Function-3");
	 }
		catch(Exception e) {
			System.out.println("Exception handled in function-3");
			System.out.println("Left Function-3");
		}
	}
}
public class UsingDucking {
	public static void main(String[] args) {
		System.out.println("Entered Main");
		Operations3 op3 =new Operations3();
		op3.function3();
		System.out.println("Left main");
		
	}

}
