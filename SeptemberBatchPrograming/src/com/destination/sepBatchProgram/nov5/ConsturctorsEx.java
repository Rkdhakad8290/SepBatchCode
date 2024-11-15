package com.destination.sepBatchProgram.nov5;
class Dog{  // extend object
	String name;
	 String color;
	 String breed;
	 int cost;
	 int age;
	 
	 // Zero Parameterized Constructor
	 
	 public Dog() {
		 super();  // by default
		 System.out.println("Hi From Zero Constructor");
	 }
	 
	 // Single Parameterized Constructor
	 public Dog(String name) {
		 this("Daccu","Brown");
		 System.out.println("Inside Single Parameterized Constructor ");
		 this.name=name;
	 }
	 // 2 Parameterized Constructor
	 public Dog(String name, String color) {
		 this("Farroo","Yello","Pug");
		 System.out.println("Inside 2 Parameterized Constructor ");
		 this.name=name;
		 this.color=color;
	 }
	 // 3 Parameterized Constructor
	 public Dog(String name, String color,String breed) {
		 this("Hima","Blue","Gr",5000);
		 System.out.println("Inside 3 Parameterized Constructor ");
		 this.name=name;
		 this.color=color;
		 this.breed=breed;
	 }
	 // 4 Parameterized Constructor
	 public Dog(String name, String color,String breed,int cost) {
		 this("Rocky","Black","Gr-Imported",19000,5);
		 System.out.println("Inside 4 Parameterized Constructor ");
		 this.name=name;
		 this.color=color;
		 this.breed=breed;
		 this.cost= cost;
	 }
	 // 5 Parameterized Constructor
	 public Dog(String name, String color,String breed,int cost, int age) {
         super();
		 System.out.println("Inside 5 Parameterized Constructor ");
		 this.name=name;
		 this.color=color;
		 this.breed=breed;
		 this.cost= cost;
		 this.age=age;
	 }

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public String getBreed() {
		return breed;
	}

	public int getCost() {
		return cost;
	}

	public int getAge() {
		return age;
	}
	 


	 
	 
}

public class ConsturctorsEx {

	public static void main(String[] args) {
		Dog d1= new Dog();
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
		System.out.println(d1.getBreed());
		System.out.println(d1.getCost());
		System.out.println(d1.getAge());
		System.out.println("========================");
		Dog d2= new Dog("Ramu");
		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getBreed());
		System.out.println(d2.getCost());
		System.out.println(d2.getAge());
		
		
		
		
		
	}

}
