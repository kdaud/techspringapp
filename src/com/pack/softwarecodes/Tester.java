package com.pack.softwarecodes;


public class Tester {
	
	static {
		System.out.println("Hello Gci");
	}
	
	public static void main(String[] args) {
		Marriage obj = new Marriage();
		obj.num1 = 43;
		obj.num2 = 38;
		obj.num2 = 37;
		obj.calculate();
		System.out.println(obj.result);
	}
	
}
