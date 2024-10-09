package com.destination.septemberBatchPrograming.sep18;

public class ArithmeticOperator {
	void add(int a,int b) {
		int res1 = a+b;
		System.out.println("Addition result is : "+res1);
		System.out.println("=========");
		
	}
	void sub(int a,int b) {
		int res2 = a-b;
		System.out.println("Substraction result is : "+res2);
		System.out.println("=========");
		
	}
	void mul(int a,int b) {
		int res3 = a*b;
		System.out.println("multiplication result is : "+res3);
		System.out.println("=========");
		
	}
	void div(int a,int b) {
		int res4 = a/b;
		System.out.println("Division result is : "+res4);
		System.out.println("=========");
		
	}
	void mod(int a,int b) {
		int res5 = a%b;
		System.out.println("Modules result is : "+res5);
		System.out.println("=========");
		
	}
	

}
 class ArithmeticOperatorExamples{
	public static void main(String[] args) {
		System.out.println("====ArithmeticOperatorExample====");
		int a=100;
		int b=50;
		ArithmeticOperator ao = new ArithmeticOperator();
		ao.add(a, b);
		ao.sub(a, b);
		ao.mul(a, b);
		ao.div(a, b);
		ao.mod(a, b);
		
	}
}
