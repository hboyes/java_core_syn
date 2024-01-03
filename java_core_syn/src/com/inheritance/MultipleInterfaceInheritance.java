package com.inheritance;

interface Flyable {
    void fly();
}

interface Swimable {
    void swim();
}

public class MultipleInterfaceInheritance implements Flyable, Swimable {

    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }

    public static void main(String[] args) {
    	MultipleInterfaceInheritance duck = new MultipleInterfaceInheritance();
        duck.fly();
        duck.swim();
    }
}
