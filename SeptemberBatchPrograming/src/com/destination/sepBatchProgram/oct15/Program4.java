package com.destination.sepBatchProgram.oct15;

public class Program4 {
	public static void main(String[] args) {
		String s1 = "rama";
		String s2 ="bama";
		
		if(s1.length()==s2.length()) {
			
				if(s1.compareTo(s2)==0) {
					System.out.println(s1.compareTo(s2));
					System.out.println("String are  equal");
				}
				
				else {
					System.out.println(s1.compareTo(s2));
					System.out.println("String are not equal");
				}
				System.out.println("-----------------");
			
			if(s1==s2) {
				
				System.out.println("references are equal");
			}
			else {
				System.out.println("references are not equal");
			}
		}
		
		else {
			System.out.println("String are not equal");
		}
	}

}
