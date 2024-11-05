package com.destination.sepBatchProgram.string.oct21;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int count=0;
		str=str.trim();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
				count++;
				
			}
		}
		System.out.println("Total word is : "+ (count+1));
		
    
	}

}
