package com.destination.sepBatchProgram.nov8;

class Animal
{
	void eat()
	{
		System.out.println("animal is eating");
	}
	void sleep()
	{
		System.out.println("animal is sleeping");
	}
	void breath()
	{
		System.out.println("animal is breathing");
	}
}
class Elephant extends Animal
{
	@Override
	void breath()
	{
		System.out.println("Elephant is breathing");
	}
	void walkslow()
	{
		System.out.println("walking slowly");
	}
}
class Lion extends Animal
{
	@Override
	void breath()
	{
		System.out.println("lion is Breathing");
	}
	void runfast()
	{
		System.out.println("Lion Run fast");
	}
}
class Deer extends Animal
{
	@Override
	void breath()
	{
		System.out.println("Deer is breathing");
	}
	void runfast()
	{
		System.out.println("Deer runs fast");
	}
}

class Forest
{
	void permit(Animal ref)
	{
		ref.eat();
		ref.sleep();
		ref.breath();
	}
}


public class PolyEx {
	public static void main(String[] args) {
		Forest f=new Forest();
		Elephant e=new Elephant();
		System.out.println("Elephant---------");
		f.permit(e);
		e.walkslow();
		System.out.println("========");
		Lion l=new Lion();
		System.out.println("Lion------------");
		f.permit(l);
		l.runfast();
		System.out.println("========");
		Deer d=new Deer();
		System.out.println("Deer-----------");
		f.permit(d);
		d.runfast();
		System.out.println("=====");
	}


}
