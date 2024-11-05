package com.destination.sepBatchProgram.string.oct23;

import java.util.Scanner;

public class Replace5Position {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z') {
				
				str1+=str.charAt(i);
			}
		}
		System.out.println("String ahid of "+str1);
	}

}
