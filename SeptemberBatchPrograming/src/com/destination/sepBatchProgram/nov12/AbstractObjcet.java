package com.destination.sepBatchProgram.nov12;
abstract class Plane1{
	 void takeOff() {
		 System.out.println("Plane take off");
	 }
	abstract void fly();
	 void land() {
		System.out.println("Plane has landed");
	}
}

public class AbstractObjcet {
	public static void main(String[] args) {
		//plane1 p1= new Plane1() // cannot create the object of abstract class direclty
		Plane1 p2; //reference of the abstract class can be created directly
		
		Plane1 p3= new Plane1() {
			
			@Override
			public void fly() {
				System.out.println("Plane flys");
			}
		};
		System.out.println(p3);
		p3.takeOff();
		p3.fly();
		p3.land();
	}

}
