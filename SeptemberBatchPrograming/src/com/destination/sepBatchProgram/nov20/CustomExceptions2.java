package com.destination.sepBatchProgram.nov20;
import java.util.Scanner;

class UnderAgeExceptions extends Exception{
	public String getMessage() {
		return "you are too young infact you are a kid. We not provide Licance";
	}
}
class OverAgeExceptions extends Exception{
	public String getMessage() {
		return "You are already a senior citizen. Do you really want Licance";
	}
}
class Candidates{
	int age;
	void collectData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age : ");
		age= sc.nextInt();

	}
	void verify() throws UnderAgeExceptions,OverAgeExceptions{
		if(age<18) {
			UnderAgeExceptions uae= new UnderAgeExceptions();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>=60) {
			OverAgeExceptions oue = new OverAgeExceptions();
			System.out.println(oue.getMessage());
			throw oue;
		}
		else {
			System.out.println("We Provide Licance");
		}
	}
}
class Rto{
	void validateCandidate(Candidates c) {
		try {
			c.collectData();
			c.verify();
		}catch(UnderAgeExceptions | OverAgeExceptions e1) {
			System.out.println("You have 2 attemps only");
			System.out.println();
			try {
				c.collectData();
				c.verify();
			}catch(UnderAgeExceptions | OverAgeExceptions e2) {
				System.out.println("You have 1 attemp only");
				System.out.println();

				try {
					c.collectData();
					c.verify();
				}catch(UnderAgeExceptions | OverAgeExceptions e3) {
					System.out.println();
					System.out.println("You have exhausted the attemps for registration");
					System.exit(0);

				}
			}
		}
	}
}


public class CustomExceptions2 {
	public static void main(String[] args) {
		Candidates c= new Candidates();
		Rto m= new Rto();
		m.validateCandidate(c);
	}
}
