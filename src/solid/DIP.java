package solid;

/*
=========================================
DEPENDENCY INVERSION PRINCIPLE (DIP)
=========================================

Definition:
High-level modules should not depend on
low-level modules. Both should depend
on abstractions (Interfaces).

This example follows DIP because
PaymentService depends on the Payment
interface instead of concrete payment classes.
 */
interface Payment {

    void pay(double amount);
}

// Low-Level Module
class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment: " + amount);
    }
}

// Low-Level Module
class CardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Card Payment: " + amount);
    }
}

class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Credit card payment" + amount);
    }
}
// High-Level Module

class PaymentService {

    private Payment payment;

    // Dependency Injection
    PaymentService(Payment payment) {
        this.payment = payment;
    }

    void makePayment(double amount) {
        payment.pay(amount);
    }
}

public class DIP {

    public static void main(String[] args) {

        Payment payment = new UpiPayment();

        PaymentService service = new PaymentService(payment);

        service.makePayment(1000);
    }
}

/*
Output:
UPI Payment: 1000.0

Revision:
DIP = Depend on Interfaces,
not Concrete Classes.

High-Level Module:
PaymentService

Low-Level Modules:
UpiPayment
CardPayment

Abstraction:
Payment Interface
 */
