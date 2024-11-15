package com.destination.sepBatchProgram.nov12;

import java.util.Scanner;

abstract class Shapes{
	double area;
	abstract void collectData();
	abstract void calculate();
	void display() {
		
	}
}
class Circle extends Shapes{
	Scanner sc= new Scanner(System.in);
	private double radius;
	final private double pi= 3.14768;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getPi() {
		return pi;
	}
	@Override
	void collectData() {
		radius =sc.nextDouble();
	}
	@Override
	void calculate() {
		area=pi*Math.pow(radius, 2);
		
	}
}
class Square extends Shapes{
	Scanner sc= new Scanner(System.in);
	
	private double side;
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	void collectData() {
		
		
	}
	@Override
	void calculate() {
		
	}
}
class Rectangle extends Shapes{
	private double l,b;

	public double getL() {
		return l;
	}

	public double getB() {
		return b;
	}
	@Override
	void collectData() {
		
	}
	@Override
	void calculate() {
		
	}
}
class Geometry{
	
	void useShape(Shapes s) {
		s.collectData();
		s.calculate();
		s.display();
		
		
	}
}

public class Allpiller {

	public static void main(String[] args) {
		Geometry g= new Geometry();
		
	}

}
