package com.destination.sepBatchProgram.nov20;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public String getMessage() {
		return "you are too young infact you are a kid. Dont think of marriage";
	}
}
class OverAgeException extends Exception{
	public String getMessage() {
		return "You are already a senior citizen. Do you really want marriage";
	}
}
class Candidate{
	int age;
	void collectData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age : ");
		age= sc.nextInt();
		
	}
	void verify() throws UnderAgeException,OverAgeException{
		if(age<18) {
			UnderAgeException uae= new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>=60) {
			OverAgeException oue = new OverAgeException();
			System.out.println(oue.getMessage());
			throw oue;
		}
		else {
			System.out.println("You will soon be dhulhe Raja");
		}
	}
}
class Matrimony{
	void validateCandidate(Candidate c) {
		try {
			c.collectData();
			c.verify();
		}catch(UnderAgeException | OverAgeException e1) {
			try {
				c.collectData();
				c.verify();
			}catch(UnderAgeException | OverAgeException e2) {
				try {
				c.collectData();
				c.verify();
			}catch(UnderAgeException | OverAgeException e3) {
				System.out.println("You have exhausted the attemps for registration");
				System.exit(0);
				
			}
		}
	}
}
}

public class CustomExceptions1 {
	public static void main(String[] args) {
		Candidate c= new Candidate();
		Matrimony m= new Matrimony();
		m.validateCandidate(c);
	}
		
	}


