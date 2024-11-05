package com.destination.sepBatchProgram.string.oct23;

import java.util.Scanner;

public class ReplaceVowel {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		char arr[]= str.toCharArray();

		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(c=='a'|| c=='A'|| c=='e'|| c=='E'||c=='i'|| c=='I'|| c=='o'||c=='O'|| c=='u'||c=='U') {
				arr[i]='@';
			}
			else {
				arr[i]=str.charAt(i);
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
