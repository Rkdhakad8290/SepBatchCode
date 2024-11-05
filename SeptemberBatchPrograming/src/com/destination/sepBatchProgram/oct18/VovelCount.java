package com.destination.sepBatchProgram.oct18;

import java.util.Scanner;

public class VovelCount {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str= sc.next();
		int vowelVount=0;
		int consCount=0;
		String str_temp="";
		String consonant="";
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(c=='a'|| c=='A'|| c=='e'|| c=='E'||c=='i'|| c=='I'|| c=='o'||c=='O'|| c=='u'||c=='U') {
				str_temp+=c;
				vowelVount++;
			}
			else {
				consonant+=c;
				consCount++;	
			}
		}
		System.out.println("Vowel String is : "+str_temp);
		System.out.println("Voerl Count is : "+vowelVount);

		System.out.println("----------");

		System.out.println("consonant String is : "+consonant);
		System.out.println("consonant count is : "+consCount);

		

		
	}

}
