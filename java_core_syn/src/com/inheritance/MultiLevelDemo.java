package com.inheritance;

class GrandParent {
	public int div(int a, int b) {
		int c = a / b;
		System.out.println(c);
		return c;
	}
}

class Parent1 extends GrandParent {
	public int add(int a, int b) {
		int c = a + b;
		System.out.println(c);
		return c;
	}
}

class Child1 extends Parent1 {
	public int sub(int a, int b) {
		int c = a - b;
		System.out.println(c);
		return c;
	}
}

public class MultiLevelDemo {
	public static void main(String[] args) {
		GrandParent parent = new GrandParent();
		parent.div(20, 10);
		Child1 child = new Child1();
		child.sub(20, 10);
		child.add(10, 10);
		child.div(20,10);
	}

}
