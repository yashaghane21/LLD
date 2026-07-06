package oops;

/*
=========================================
INHERITANCE
=========================================

Definition:
Inheritance allows one class to acquire
the properties and methods of another class.

Keyword:
extends

Real-Life Example:
Dog IS-A Animal
*/

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    // Inherits sound() from Animal
}

public class Inheritance {

    public static void main(String args[]) {

        // Dog object can access Animal's method
        Dog d = new Dog();
        d.sound();
    }
}

