package com.destination.sepBatchProgram.nov12;

abstract class Plane{
	abstract void takeOff();	
	abstract void fly();
	abstract void land();
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo Plane  Fly at low Height ");
	}
	@Override
	void takeOff() {
		System.out.println("Cargo Plane take off");
	}
	@Override
	void land() {
		System.out.println("Cargo Plane has landed");
	}
	void carryGoods() {
		System.out.println("Cargo Plane carry Goods");
	}
	
}
class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Passenger Plane  Fly at medium Height ");
	}
	@Override
	void takeOff() {
		System.out.println("Passenger Plane take off");
	}
	@Override
	void land() {
		System.out.println("Passenger Plane has landed");
	}
	void carryPassengers() {
		System.out.println("Passenger Plane carry Passenger");
	}
	
}
class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Fighter Plane  Fly at great Height ");
	}
	@Override
	void takeOff() {
		System.out.println("Fighter Plane take off");
	}
	@Override
	void land() {
		System.out.println("Fighter Plane has landed");
	}
	void carryWeapons() {
		System.out.println("Fighter Plane carry weapons");
	}
	
}

public class AbstractionEx {

	public static void main(String[] args) {
		CargoPlane cp= new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp =new FighterPlane();
		Plane ref=new CargoPlane();
		
		System.out.println("Cargo Plane----------");
		ref=cp;
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.carryGoods();
		System.out.println("=========================");
		
		System.out.println("Passenger Plane----------");
		ref=pp;
		ref.takeOff();
		ref.fly();
		ref.land();
		pp.carryPassengers();
		System.out.println("=========================");
		
		System.out.println("Fighter Plane----------");
		ref=fp;
		ref.takeOff();
		ref.fly();
		ref.land();
		fp.carryWeapons();
		System.out.println("=========================");
		
		
		
		
	}

}
