package com.example.chessgame;

public class TestDog {

    public static void main(String[] args) {
        Animal a = new Animal();   // Animal reference and object
        Animal b = new Dog();   // Animal reference but Dog object
        Dog c = new Dog();

        a.move();   // runs the method in Animal class
        b.move();   // runs the method in Dog class
        c.bark();
    }
}