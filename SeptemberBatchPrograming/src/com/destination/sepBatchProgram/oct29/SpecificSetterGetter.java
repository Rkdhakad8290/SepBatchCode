package com.destination.sepBatchProgram.oct29;
import java.util.Scanner;
class Tiger{
	String name;
	String color;
	String country;
	int age;
	
	void setStaticName() {
		name="ramu";
	}
	void setStaticColor() {
		color="orange";
	}

	void setStaticCountry() {
		country="africa";
	}

	void setStaticAge() {
		age=7;
	}
	
	void setDynamicName(String s1){
		name=s1;
	}
	void setDynamicColor(String s2) {
		color=s2;
	}
	void setDynamicCountry(String s3) {
		country=s3;
	}
	void setDynamicAge(int i1) {
		age=i1;
	}
	String getName() {
		return name;
	}
	String getColor() {
		return color;
		
	}
	String getCountry() {
		return country;
	}
	int getAge() {
		return age;
	}

}

public class SpecificSetterGetter {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		System.out.println(t1.getName());
		System.out.println(t1.getColor());
		System.out.println(t1.getCountry());
		System.out.println(t1.getAge());
		System.out.println("===============");

		t1.setStaticName();
		t1.setStaticColor();
		t1.setStaticCountry();
		t1.setStaticAge();
		
		System.out.println(t1.getName());
		System.out.println(t1.getColor());
		System.out.println(t1.getCountry());
		System.out.println(t1.getAge());
		System.out.println("===============");
		 
		Tiger t2 =new Tiger();
		
		System.out.println(t2.getName());
		System.out.println(t2.getColor());
		System.out.println(t2.getCountry());
		System.out.println(t2.getAge());
		System.out.println("===============");
		t2.setDynamicName("Samu");
		t2.setDynamicColor("White");
		t2.setDynamicCountry("India");
		t2.setDynamicAge(8);
		
		System.out.println(t2.getName());
		System.out.println(t2.getColor());
		System.out.println(t2.getCountry());
		System.out.println(t2.getAge());
		System.out.println("===============");
	}

}
