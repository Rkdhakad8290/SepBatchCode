package com.destination.sepBatchProgram.oct18;
import java.util.Scanner;

class VowelOps{
	int total_vowel;
	int total_consonant;
	int non_alpha;
	int total_capital_vowel;
	int total_lower_case_vowel;
	
	public void countAllVowels(String str) {
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='O'||str.charAt(i)=='I'||str.charAt(i)=='U') {
					total_vowel++;
				}
				else {
					total_consonant++;
				}
			}
		}
	}
}

public class AlphabateOps {
	public static void main(String[] args) {
		
	}

}
