package com.destination.sepBatchProgram.string.oct21;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int count_1=0;
		int count_2=0;
		int count_3=0;
		int count_4=0;

		if(str.length()>=10) {
			
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				count_1=1;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z' ) {
				count_2 =1;
			}
			else if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				count_3 = 1;
			}
			else if(str.charAt(i)=='@' || str.charAt(i)=='%' || str.charAt(i)=='$' || str.charAt(i)=='!' || str.charAt(i)=='#') {
				count_4 = 1;
			}
			
		}
		}
		
		
		if(count_1==1 && count_2==1 && count_3==1 && count_4==1) {
			System.out.println("Valid password");
			
		}
		else {
			System.out.println("Unvalid Password");
		}
	}

}
