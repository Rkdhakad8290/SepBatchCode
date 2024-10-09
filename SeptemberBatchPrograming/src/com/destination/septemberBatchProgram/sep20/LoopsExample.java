package com.destination.septemberBatchProgram.sep20;

public class LoopsExample {
	public static void main(String[] args) {
		
		System.out.println("FOR LOOP EXAMPLE");
		System.out.println("============");

		
		for(int i=1;i<=10;i++) {
			System.out.println("FOR LOOP EXECUTED :"+ i);
		}
		System.out.println("============");
		System.out.println("while LOOP EXAMPLE");
		System.out.println("============");
		int i=1;
		while(i<=10) {
			System.out.println("WHILE LOOP EXECUTED :"+ i);
			i++;
		}
		System.out.println("============");
		System.out.println("DO...WHILE LOOP EXAMPLE");
		System.out.println("============");
		int j=1;
		do {
			System.out.println("do...while LOOP EXECUTED :"+ j);
			j++;
		}while(j<=10);
		System.out.println("============");
	}

}
