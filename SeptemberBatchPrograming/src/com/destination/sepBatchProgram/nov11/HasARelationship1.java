package com.destination.sepBatchProgram.nov11;
class Heart{
	String name;
	int age;
	
	public Heart(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
class Bike{
	String company;
	String name;
	double price;
	public Bike(String company, String name, double price) {
		super();
		this.company = company;
		this.name = name;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
}
class Student{
	Heart h= new Heart("Rahul",24);
	void hasBike(Bike b) {
		System.out.println(b.company);
		System.out.println(b.getName());
		System.out.println(b.getPrice());
	}
}

public class HasARelationship1 {

	public static void main(String[] args) {
		Student s= new Student();
		Bike b= new Bike("Yamaha", "MT-15",185000);
		
		System.out.println(s.h.getName());
		System.out.println(s.h.getAge());
		
		s.hasBike(b);
		s= null;
		
		System.out.println(b.getCompany());
		System.out.println(b.getName());
		System.out.println(b.getPrice());
		
	}

}
