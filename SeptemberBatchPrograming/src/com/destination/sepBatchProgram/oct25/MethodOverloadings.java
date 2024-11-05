package com.destination.sepBatchProgram.oct25;

class Calculater {
	int add(int a, int b) {
		return a + b;
	}

	float add(float a, int b) {
		return a + b;
	}

	float add(float a, float b) {
		return a + b;
	}

	double add(float a, double b) {
		return a + b;
	}

	double add(double a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}

	double add(float a, int b, double c) {
		return a + b;
	}

	double add(int a, float b, double c) {
		return a + b;
	}

	double add(double a, int b, float c) {
		return a + b;
	}

}

public class MethodOverloadings {
	public static void main(String[] args) {
		Calculater ch = new Calculater();
		System.out.println(ch.add(10, 20));
		System.out.println(ch.add(10.23f, 20));
		System.out.println(ch.add(10.23f, 20.45f));
		System.out.println(ch.add(10.23f, 20, 21.45));
		System.out.println(ch.add(10, 20.23f, 23.354));

	}

}
