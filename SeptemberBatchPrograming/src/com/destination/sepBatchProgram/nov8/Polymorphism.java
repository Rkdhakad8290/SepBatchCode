package com.destination.sepBatchProgram.nov8;
class Plane{
	void takeOff() {
		System.out.println("Plane take off");
	}
	void fly() {
		System.out.println("Plane is Flying ");
	}
	void land() {
		System.out.println("Plane has landed");
	}
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo Plane  Fly at low Height ");
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
	void carryPassengers() {
		System.out.println("Passenger Plane carry Passenger");
	}
	
}
class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Fighter Plane  Fly at great Height ");
	}
	void carryWeapons() {
		System.out.println("Fighter Plane carry Goods");
	}
	
}


public class Polymorphism {

	public static void main(String[] args) {
		CargoPlane cp= new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp =new FighterPlane();
		Plane ref;
		
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
