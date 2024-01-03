package com.basics;
//import java.io.*;
//import javafx.application.Application;
public class Calculator {

	//variable declaration
	//method/function definition
	static double pi=3.14159265359;
	double piresult;
	int no1=20, no2=10;
	int result;
	
	public int add() {
		result = no1 +no2;
		System.out.println("The addition result is:" +result);
		return result;
	}
	
	public int subtract() {
		result= no1-no2;
		System.out.println("The subtraction result is:" +result);
		return result;
	}
	
	public int multiply() {
		result= no1*no2;
		System.out.println("The multiplication result is:" +result);
		return result;
	}
	
	public int division() {
		result= no1/no2;
		System.out.println("The division result is:" +result);
		return result;
	}
	
	public int modulus() {
		result= no1%no2;
		System.out.println("The remainder result is:" +result);
		return result;
	}
	
	public double multiplypi() {
		piresult= pi*no2;
		System.out.println("The multiplication of pi result is:" +piresult);
		return piresult;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add();
		calc.subtract();
		calc.multiply();
		calc.division();
		calc.modulus();
		calc.multiplypi();
	}
}
