package com.destination.sepBatchProgram.oct18;
import java.util.Scanner;

public class PalindromCheck {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.next();
		String temp_str="";
		int flag=0;
		
		for(int i=str.length()-1;i>=0;i--) {
			temp_str+=str.charAt(i);
		}
		System.out.println("The reverse String is: "+temp_str);
		System.out.println("----------");
		
		//Approach-1
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=temp_str.charAt(i)){
				flag=1;
				System.out.println("String is not a palindrom");
				break;
			}
		}
		if(flag==0) {
			System.out.println("String is a palindrom");
		}
		System.out.println("----------");
		
		//Approach-2
		
		if(str.equals(temp_str)) {
			System.out.println("String is palindrom");
		}
		else {System.out.println("String is not palindrom");
         
	}

}
}
