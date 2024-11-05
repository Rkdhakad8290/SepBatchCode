package com.destination.sepBatchProgram.string.oct22;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]= new int[26];
		System.out.println("Enter the String ");
		String str1 = sc.nextLine();
		str1=str1.toUpperCase();
		for(int i=0;i<arr.length;i++) {
			arr[i]=0;
		}

		for(int i=0;i<str1.length();i++) {
			int temp = str1.charAt(i)-65;
			arr[temp]= 1;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=1) {
				System.out.println("String is not a panagram");
				System.exit(0);
			}
		}

		System.out.println("String is a panagram");


	}

}
