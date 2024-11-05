package com.destination.sepBatchProgram.string.oct22;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String no  1 :");
		String str1 = sc.nextLine();
		System.out.println("Enter the String no 2 :");
		String str2 = sc.nextLine();
		if(str1.length()==str2.length()) {
			str1=str1.toLowerCase();
			str2=str2.toLowerCase();

			char[]ch1=str1.toCharArray();
			char[]ch2=str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if(Arrays.equals(ch1, ch2)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
		}
		else {
			System.out.println("Not anagram");
		}
	}

}
