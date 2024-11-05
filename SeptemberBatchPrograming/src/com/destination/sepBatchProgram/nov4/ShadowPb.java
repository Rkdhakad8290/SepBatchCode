package com.destination.sepBatchProgram.nov4;
class Dog{
	String name;
	String color;
	String breed;
	int cost;
	int age;

	void setData(String name,String color, String breed, int cost,int age) {
		name=name;
		color=color;
		breed=breed;
		cost=cost;
		age=age;
	}
	void setName(String name) {
		name=name;
	}
	void setColor(String color) {
		color=color;
	}
	void setBreed(String breed) {
		breed=breed;
	}
	void setCost(int cost) {
		cost=cost;
	}
	void setAge(int age) {
		age=age;
	}

	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);

	}
}

public class ShadowPb {

	public static void main(String[] args) {
      Dog d1= new Dog();
      d1.setData("Tommy","Brown","Pug",5000,2);
      d1.getData();
      System.out.println("----------------");
      
      Dog d2= new Dog();
      d2.setName("Jimmy");
      d2.setColor("White");
      d2.setBreed("Gr");
      d2.setCost(4000);
      d2.setAge(3);
      d2.getData();
	}
}
