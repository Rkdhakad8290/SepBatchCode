package com.destination.sepBatchProgram.oct29;
import java.util.Scanner;
class Dog{
	String name;
	String color;
	String breed;
	int cost;
	int age;
	
	void setDetaStatic() {
		name ="jimmy";
		color = "Red";
		breed = "jerman";
		cost=6000;
		age=5;
	}
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);

	}
	public void setDataDynamic(String s1, String s2, String s3, int i1, int i2) {		
		name=s1;
		color=s2;
		breed=s3;
		cost=i1;
		age=i2;
	}
	
	
}

public class EncapsulationgerericExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dog d =new Dog();
		d.getData();
		System.out.println("============");
		d.getData();
		System.out.println("============");

		Dog d1 =new Dog();
		System.out.println("Enter the dog name :");
		String name =sc.next();
		System.out.println("Enter the dog color :");
		String color =sc.next();
		System.out.println("Enter the dog breed :");
		String breed =sc.next();
		System.out.println("Enter the dog cost :");
		int cost =sc.nextInt();
		System.out.println("Enter the dog age :");
		int age =sc.nextInt();
		
		d1.setDataDynamic(name,color,breed,cost,age);
		d1.getData();
	}

}
