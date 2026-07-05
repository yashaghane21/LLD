package solid;

interface Payment {

    void processPayment(double amount);
}

class indianPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Indian payment of " + amount);
    }
}

class UkPayments implements Payment {

    public void processPayment(double amount) {
        System.out.println("processing UK payment" + amount);
    }
}

class USPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing US payment of " + amount);
    }
}

class urope implements Payment {

    public void processPayment(double amount) {
        System.out.println("Processing urope payment of " + amount);

    }
}

public class OpenClose {

    public static void main(String[] args) {
        Payment indianPayment = new indianPayment();
        indianPayment.processPayment(1000);

        Payment usPayment = new USPayment();
        usPayment.processPayment(2000);

        Payment urPayment = new urope();
        urPayment.processPayment(222);

        Payment ukPayment = new UkPayments();
        ukPayment.processPayment(8000);

    }
}
