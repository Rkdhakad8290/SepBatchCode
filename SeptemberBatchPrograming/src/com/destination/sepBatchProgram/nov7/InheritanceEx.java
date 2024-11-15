package com.destination.sepBatchProgram.nov7;
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




public class InheritanceEx {
	public static void main(String[] args) {
		
		Elephant e=new Elephant();
		System.out.println("Elephant---------");
		 e.eat();
		 e.sleep();
		 e.breath();
		e.walkslow();
		System.out.println("========");
		Lion l=new Lion();
		System.out.println("Lion------------");
		 l.eat();
		 l.sleep();
		 l.breath();
		l.runfast();
		System.out.println("========");
		Deer d=new Deer();
		System.out.println("Deer-----------");
		 d.eat();
		 d.sleep();
		 d.breath();
		d.runfast();
		System.out.println("=====");
	}

}
