package solid;

/*
=========================================
LISKOV SUBSTITUTION PRINCIPLE (LSP)
=========================================

Definition:
Objects of a superclass should be replaceable
with objects of its subclasses without
breaking the program.

This example follows LSP because every
Payment class behaves correctly as a Payment.
 */
interface Payment {

    void processPayment(double amount);
}

class IndianPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Indian Payment: " + amount);
    }
}

class USPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing US Payment: " + amount);
    }
}

class UKPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UK Payment: " + amount);
    }
}

public class Liskow {

    public static void main(String[] args) {

        // Parent reference can refer to any child object
        Payment payment;

        payment = new IndianPayment();
        payment.processPayment(1000);

        payment = new USPayment();
        payment.processPayment(2000);

        payment = new UKPayment();
        payment.processPayment(3000);
    }
}
