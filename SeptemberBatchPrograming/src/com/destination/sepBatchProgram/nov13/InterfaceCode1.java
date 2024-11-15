package com.destination.sepBatchProgram.nov13;
interface Calculater{ // rule 3
	void add(); // rule 1,2
	void sub();
}
class Calcy1 implements Calculater //rule 4
{

	@Override
	public void add() {		
	}

	@Override
	public void sub() {		
	}
	
}
class Calcy2 implements Calculater //rule 4
{

	@Override
	public void add() {		
	}

	@Override
	public void sub() {		
	}
	
}

public class InterfaceCode1 {
	public static void main(String[] args) {
		//Calculater c= new Calculater(); //rule 5
		Calculater c2; // rule 6
		//rule 7
		Calculater c3 = new Calculater() {
			
			@Override
			public void sub() {
				
			}
			
			@Override
			public void add() {
				
			}
		};
	}

}
