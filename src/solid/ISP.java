package solid;

interface DriverInterface {

    void acceptRide();

    void drive();
}

interface RiderInterface {

    void bookRide();

    void cancelRide();
}

class Rider implements RiderInterface {

    @Override
    public void bookRide() {
        System.out.println("Booking a ride...");
    }

    @Override
    public void cancelRide() {
        System.out.println("Cancelling the ride...");
    }
}

class Driver implements DriverInterface {

    @Override
    public void acceptRide() {
        System.out.println("Accepting the ride...");
    }

    @Override
    public void drive() {
        System.out.println("Driving the rider...");
    }
}

class ISP {

    public static void main(String[] args) {
        Rider rider = new Rider();
        rider.bookRide();
        rider.cancelRide();

        Driver driver = new Driver();
        driver.acceptRide();
        driver.drive();
    }
}
