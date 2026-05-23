package J05_Abstraction;

// Demonstrating Default and Static Methods in Interface

interface Vehicle {

    // Default method
    default void start() {
        System.out.println("Vehicle is starting...");
    }

    // Static method
    static void serviceInfo() {
        System.out.println("Regular servicing improves performance.");
    }
}

class Car implements Vehicle {

    void drive() {
        System.out.println("Car is driving...");
    }
}

public class DefaultStaticMethodInterfaceDemo {

    public static void main(String[] args) {

        // Creating Car objects
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        c1.start();
        c1.drive();

        System.out.println();

        c2.start();
        c2.drive();

        System.out.println();

        c3.start();
        c3.drive();

        System.out.println();

        // Calling static interface method
        Vehicle.serviceInfo();
    }
}