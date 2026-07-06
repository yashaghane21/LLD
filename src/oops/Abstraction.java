package oops;

/*
=========================================
ABSTRACTION
=========================================

Definition:
Abstraction hides implementation details
and shows only essential functionality.

Achieved Using:
✔ Abstract Class
✔ Interface

Real-Life Example:
ATM Machine
- User knows how to withdraw money.
- Internal processing is hidden.
*/

abstract class Account {

    // Abstract Method (No Implementation)
    abstract void make();
}

class Saving extends Account {

    // Providing implementation
    @Override
    void make() {
        System.out.println("Its Call");
    }
}

public class Abstraction {

    public static void main(String args[]) {

        // Parent reference, Child object (Runtime Polymorphism)
        Account a = new Saving();

        // Calls Saving's implementation
        a.make();
    }
}

/*
Output:
Its Call

Revision:
Abstraction = Hide Implementation + Show Functionality
*/