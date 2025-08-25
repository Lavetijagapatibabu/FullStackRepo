package com.jb.main;

public class Addition {

	public Addition() {
		System.out.println("Addition.0-Param()");
	}
	public int performingAddtion() {
		int a=10;
		int b=20;
		//performing Addition Operation
		int z=a+b;
		return z;
	}
	public int performingSubStraction() {
		int a=20;
		int b=10;
		return a-b;
	}

	public int performingMultiplication() {
		int a =10;
		int b=20;
		return a*b;
	}
	public float performingDivision() {
		int a=10;
		int b=20;
		return a/b;
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
	}

}
