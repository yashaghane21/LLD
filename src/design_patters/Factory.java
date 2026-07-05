// Factory Pattern

// Definition:
// Creates objects without exposing object creation logic to the client.

// Purpose:
// Hide object creation and reduce coupling.

// Components:
// 1. Product (Interface)
// 2. Concrete Products
// 3. Factory
// 4. Client

// Flow:
// Client → Factory → Object

// Advantages:
// ✔ Centralized object creation
// ✔ Loose coupling
// ✔ Easy maintenance

// Disadvantage:
// ❌ Simple Factory must be modified when new product types are added.
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
