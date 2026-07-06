package oops;

/*
=========================================
ENCAPSULATION
=========================================

Definition:
Encapsulation is the process of wrapping data (variables)
and methods (functions) into a single unit (class) and
restricting direct access to the data.

Here,
salary is private (hidden).
It can only be accessed using
setSalary() and getSalary().
*/

class Employee {

    // Private variable -> Cannot be accessed directly outside the class
    private int salary;

    // Setter Method -> Used to update the salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Getter Method -> Used to read the salary
    public int getSalary() {
        return salary;
    }
}

public class Encapsulation {

    public static void main(String args[]) {

        // Creating Employee Object
        Employee e = new Employee();

        // Setting salary using Setter
        e.setSalary(444);

        // Getting salary using Getter
        System.out.println(e.getSalary());
    }
}

/*
=========================================
OUTPUT
=========================================

444

=========================================
INTERVIEW QUESTIONS
=========================================

Q1. What is Encapsulation?

A.
Wrapping data and methods into a single class
and restricting direct access to the data.

-----------------------------------------

Q2. Why is salary private?

A.
To prevent direct modification from outside
the class and achieve Data Hiding.

-----------------------------------------

Q3. Why use Getter and Setter?

A.
To provide controlled access to private variables.

-----------------------------------------


*/