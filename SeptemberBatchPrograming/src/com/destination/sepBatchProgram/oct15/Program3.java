package com.destination.sepBatchProgram.oct15;

public class Program3 {
	public static void main(String[] args) {
		String s1 = "rama";
		String s2 ="RAMA";
		
		if(s1.length()==s2.length()) {
			
				if(s1.equalsIgnoreCase(s2)==true) {
					System.out.println("String are  equal");
				}
				
				else {
					System.out.println("String are not equal");
				}
				System.out.println("==============");
			
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