package solid;

/*
=========================================
OPEN/CLOSED PRINCIPLE (OCP)
=========================================

Definition:
Software entities should be open for extension
but closed for modification.

This example adds new payment methods
without modifying the Payment interface.
*/

interface Payment {

    void processPayment(double amount);
}

// New payment methods extend the system
class IndianPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Indian Payment: " + amount);
    }
}

class UKPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UK Payment: " + amount);
    }
}

class USPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing US Payment: " + amount);
    }
}

class EuropePayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Europe Payment: " + amount);
    }
}

public class OpenClose {

    public static void main(String[] args) {

        Payment indian = new IndianPayment();
        indian.processPayment(1000);

        Payment us = new USPayment();
        us.processPayment(2000);

        Payment europe = new EuropePayment();
        europe.processPayment(5000);

        Payment uk = new UKPayment();
        uk.processPayment(8000);
    }
}
