package com.destination.sepBatchProgram.nov11;
class Heart1 {
	String name;
	int age;

	public Heart1(String name, int age) {
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

class Brain {
	double weight;

	public Brain(double weight) {
		super();
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

}

class Human {
	Heart1 h= new Heart1("Rahul", 24);
	Brain b= new Brain(1.50);

	void hasHeart(Heart1 h) {
		System.out.println(h.getName());
		System.out.println(h.getAge());

	}
	void hasBrain(Brain b) {
		System.out.println(b.getWeight());

	}

}

class Students extends Human {	
	void hasCar(Car c) {
		System.out.println(c.company);
		System.out.println(c.getName());
		System.out.println(c.getPrice());
	}
	void hasMobile(Mobile1 m) {
		System.out.println(m.company);
		System.out.println(m.getModel());
		System.out.println(m.getPrice());
	}

}
class Car {
	String company;
	String name;
	double price;
	public Car(String company, String name, double price) {
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

class Mobile1 {
	String company;
	String model;
	double Price;
	public Mobile1(String company, String model, double price) {
		super();
		this.company = company;
		this.model = model;
		Price = price;
	}
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return Price;
	}


}
public class HasA_Or_IsA_RelationShip {

	public static void main(String[] args) {
		Brain b= new Brain(2.5);
		Heart1 h= new Heart1("Dhakad", 23);
		Students s= new Students();
		Car c= new Car("TATA", "Nexon.ev", 12.5);
		Mobile1 m= new Mobile1("Apple", "Iphone16", 70000);
		System.out.println(s.h.getName());
		System.out.println(s.h.getAge());

		System.out.println(s.b.getWeight());

		System.out.println("===============");

		System.out.println(s.h.getAge());
		System.out.println(s.h.getName());
		System.out.println("==============");

		System.out.println(c.company);
		System.out.println(c.getName());
		System.out.println(c.getPrice());

		System.out.println("==============");

		System.out.println(m.company);
		System.out.println(m.getModel());
		System.out.println(m.getPrice());
		System.out.println("===============");

		s.hasBrain(b);
		System.out.println("=================");
		s.hasHeart(h);
		System.out.println("=================");

		s.hasCar(c);
		System.out.println("=================");

		s.hasMobile(m);






	}

}
