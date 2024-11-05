package com.destination.sepBatchProgram.string.oct23;

import java.util.Scanner;

public class VowelEvenPos {
	public static void main(String[] args) {
		 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(c=='a'|| c=='A'|| c=='e'|| c=='E'||c=='i'|| c=='I'|| c=='o'||c=='O'|| c=='u'||c=='U') {
				if(i%2!=0) {
				  count++;
				}
			}
		}
		System.out.println("Even position Vowels count is : "+count);
	}

}
