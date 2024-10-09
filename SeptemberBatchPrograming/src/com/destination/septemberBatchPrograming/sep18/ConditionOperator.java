package com.destination.septemberBatchPrograming.sep18;

public class ConditionOperator {
	public static void main(String[] args) {
		
		System.out.println("=====Conditional Operator Example=====");
		
		int a=100;
		int b=50;
		
		System.out.println("Value No : "+a);
		System.out.println("Value No : "+b);
		System.out.println("===============");
		
		boolean res1 = (a>b);
		System.out.println("Greater than result : "+res1);
		System.out.println("=============");
		
		boolean res2 = (a<b);
		System.out.println("Lesser than result : "+res2);
		System.out.println("=============");
		
		boolean res3 = (a>=b);
		System.out.println("Greater than or equal result : "+res3);
		System.out.println("=============");
		
		boolean res4 = (a<=b);
		System.out.println("Lesser than or equal result : "+res4);
		System.out.println("=============");
		
		boolean res5 = (a==b);
		System.out.println("Equal result : "+res5);
		System.out.println("=============");
		
		boolean res6 = (a!=b);
		System.out.println("Not Equal result : "+res6);
		System.out.println("=============");
	}

}
