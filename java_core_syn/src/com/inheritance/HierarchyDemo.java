package com.inheritance;


class Parent2 {
	public int add(int a, int b) {
		int c = a + b;
		System.out.println(c);
		return c;
	}
}

class Child2 extends Parent2 {
	public int sub(int a, int b) {
		int c = a - b;
		System.out.println(c);
		return c;
	}
}

class Child3 extends Parent2 {
	public int mult(int a, int b) {
		int c = a * b;
		System.out.println(c);
		return c;
	}
}

public class HierarchyDemo {
	public static void main(String[] args) {
		Parent2 parent = new Parent2();
		//parent.div(20, 10);
		Child3 child = new Child3();
		//child.sub(20, 10);
		child.add(10, 10);
		//child.div(20,10);
	}

}
