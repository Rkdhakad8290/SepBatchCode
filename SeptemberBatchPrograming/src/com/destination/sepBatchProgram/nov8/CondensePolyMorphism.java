package com.destination.sepBatchProgram.nov8;
class Plane1{
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
class CargoPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Cargo Plane  Fly at low Height ");
	}
	void carryGoods() {
		System.out.println("Cargo Plane carry Goods");
	}
	
}
class PassengerPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Passenger Plane  Fly at medium Height ");
	}
	void carryPassengers() {
		System.out.println("Passenger Plane carry Passenger");
	}
	
}
class FighterPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Fighter Plane  Fly at great Height ");
	}
	void carryWeapons() {
		System.out.println("Fighter Plane carry Weapons");
	}
	
}
class Airport{
	void permit(Plane1 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class CondensePolyMorphism {

	public static void main(String[] args) {
		CargoPlane1 cp= new CargoPlane1();
		PassengerPlane1 pp = new PassengerPlane1();
		FighterPlane1 fp =new FighterPlane1();
		Airport a= new Airport();
		
		System.out.println("Cargo Plane----------");
		a.permit(cp);
		cp.carryGoods();
		System.out.println("=========================");
		
		System.out.println("Passenger Plane----------");
		a.permit(pp);
		pp.carryPassengers();
		System.out.println("=========================");
		
		System.out.println("Fighter Plane----------");
		a.permit(fp);
		fp.carryWeapons();
		System.out.println("=========================");
		
		
	}

}
