package com.inheritance;

class Parent {
	public int add(int a, int b) {
		int c = a + b;
		System.out.println(c);
		return c;
	}
}

class Child extends Parent {
	public int sub(int a, int b) {
		int c = a - b;
		System.out.println(c);
		return c;
	}
}

public class Main {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.add(20, 10);
		Child child = new Child();
		child.sub(20, 10);
		child.add(10, 10);
	}

}
