package design_patters;

interface Vehicle {

    void drive();
}

class Car implements Vehicle {

    public void drive() {
        System.out.println("Car is there");
    }
}

class Bike implements Vehicle {

    public void drive() {
        System.out.println("Bike is there");
    }
}

class VehicleFactory {

    public Vehicle getVehicle(String type) {

        if (type.equalsIgnoreCase("car")) {
            return new Car();
        }

        if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        }

        return null;
    }
}

public class Factory {

    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();

        Vehicle vehicle = factory.getVehicle("car");
        Vehicle vehicle2 = factory.getVehicle("bike");

        vehicle2.drive();
    }
}
