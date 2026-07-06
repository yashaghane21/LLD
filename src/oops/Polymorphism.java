package oops;

/*
=========================================
POLYMORPHISM
=========================================

Definition:
Polymorphism means "One Interface, Many Forms".

Types:
1. Compile-Time Polymorphism (Method Overloading)
2. Runtime Polymorphism (Method Overriding)

This example demonstrates Method Overloading.
*/

class Calculator {

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    // Same method name, different parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Polymorphism {

    public static void main(String args[]) {

        Calculator ca = new Calculator();

        System.out.println(ca.add(10, 20));
        System.out.println(ca.add(10, 20, 30));
    }
}

/*
Output:
30
60

Revision:
Polymorphism = One Interface, Many Forms

Method Overloading → Compile-Time Polymorphism
Method Overriding → Runtime Polymorphism
*/