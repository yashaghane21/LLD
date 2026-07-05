package solid;

interface Payment {

    void processPayment(int amount);
}

class cashPayment implements Payment {

    @Override
    public void processPayment(int amount) {
        System.out.println("Processing cash payment of amount: " + amount);
    }
}

class cardPayment implements Payment {

    @Override
    public void processPayment(int amount) {
        System.out.println("Processing card payment of amount: " + amount);
    }
}

public class PaymentService {

    public static void main(String[] args) {
        Payment cashPayment = new cashPayment();
        cashPayment.processPayment(100);

        Payment cardPayment = new cardPayment();
        cardPayment.processPayment(200);
    }
}
