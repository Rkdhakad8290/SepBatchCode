package com.destination.sepBatchProgram.nov13;
//rule 11
interface Calculater1{
	int a=10;
}
//rule 13
interface Operations{
	void op1(); //abstract methods(default method of interface
	void op2(); //abstract methods(default method of interface
	void op3(); //abstract methods(default method of interface
	void op4(); //abstract methods(default method of interface
	default void op5() {
		
	}
	static void op6() {
		
	}
}
//rule 14
@FunctionalInterface
interface Operations1{
	void op1();//abstract method(default method of interface
	default void op4() {
		
	}
	static void op3() {
		
	}
	default void op5() {
		
	}
	static void  op6() {
		
	}
}
//rule 15
interface Empty{
	
}
class Testing implements Calculater1{
	void disp() {
		System.out.println(a);
		//a=200 // rule 11
	}
}

interface Parent1{
	
}
class Parent2{
	
}
//rule 16
class Child extends Parent2 implements Parent1{
	
}

public class InterfaceCode3 {

}
