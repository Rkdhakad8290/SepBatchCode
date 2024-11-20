package com.destination.sepBatchProgram.nov19;
import java.util.Scanner;

class Operation1{
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

class Operation2{
	void function2() {
		try {
		System.out.println("Entered Function-2");
		Operation1 op1= new Operation1();
		op1.function1();
		System.out.println("Left Function-2");
		}
		catch(Exception e) {
			System.out.println("Exception handled in function-2");
			System.out.println("Left Function-2");
			throw e; // re=throwing the exception
		}
	}
}
class Operation3{
	void function3() {
		try {
			
		
		System.out.println("Entered Function-1");
		Operation2 op2= new Operation2();
		op2.function2();
		System.out.println("Left Function-3");
	 }
		catch(Exception e) {
			System.out.println("Exception handled in function-3");
			System.out.println("Left Function-3");
			throw e;
		}
	}
}

public class UsingThrows {

	public static void main(String[] args) {
		System.out.println("Entered Main");
		try {
		Operation3 op3 =new Operation3();
		op3.function3();
		}
		catch(Exception e) {
			System.out.println("Exception handled in Main");
		}
		System.out.println("Left main");
		
	}

}
