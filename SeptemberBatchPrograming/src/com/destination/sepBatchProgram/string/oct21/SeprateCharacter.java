package com.destination.sepBatchProgram.string.oct21;

import java.util.Scanner;

public class SeprateCharacter {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String alphabates = "";
		String numbers ="";
		String specials ="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z') {
				alphabates+=str.charAt(i);
			}
			else if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				numbers+=str.charAt(i);
			}
			else  { 
				specials+=str.charAt(i);
			}
		}
		System.out.println(alphabates);
		System.out.println(numbers);
		System.out.println(specials);
	}

}
