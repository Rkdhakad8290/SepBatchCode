package com.destination.sepBatchProgram.nov13;
//rule 12
 interface Test1{
	 void disp1();
	// void sub() {
		 
	// }
 }
 interface Test2{
	 void disp2();
 }
 // rule 9
 //interface Test3 implements Test2{
	 
// }
 //rule 10
 //interface Test4 implements Test2{
	 
 //}
 //rule 8
 class Sample implements Test1, Test2{

	@Override
	public void disp2() {
		
	}

	@Override
	public void disp1() {
		
	}

//	@Override
//	public void sub() {
//		
//	}
	 
 }

public class InterfaceCode2 {

}
