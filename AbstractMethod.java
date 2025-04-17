abstract class Vehicle {
    abstract void start(); // Must be implemented by subclasses

    void stop() {  // Common method for all vehicles
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starting...");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starting...");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Output: Car starting...
        myCar.stop();  // Output: Vehicle stopped.
    }
}
