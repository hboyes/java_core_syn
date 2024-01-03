package com.inheritance;

interface Walkable {
    void walk();
}

interface Flyable1 {
    void fly();
}

class Bird implements Walkable, Flyable1 {
    @Override
    public void walk() {
        System.out.println("Bird is walking.");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

class Sparrow extends Bird {
    @Override
    public void walk() {
        System.out.println("Sparrow is hopping.");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.walk();
        sparrow.fly();
    }
}

