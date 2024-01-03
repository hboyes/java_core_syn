package com.nterface.example;

class Test {
	interface Test1{
		void show();
	}
	
}

class Testing implements Test.Test1{

	@Override
	public void show() {
		System.out.println("showing interface within the class and implementing the abstract method.");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Test.Test1 obj1;
		obj1 = new Testing();
		obj1.show();
	}
}
