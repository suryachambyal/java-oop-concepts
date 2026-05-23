package J04_Inheritance;

// Demonstrating Multilevel Inheritance

class Vehicle {

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving...");
    }
}

class ElectricCar extends Car {

    void charge() {
        System.out.println("Electric car is charging...");
    }
}

public class MultilevelInheritanceDemo {

    public static void main(String[] args) {

        // Creating ElectricCar objects
        ElectricCar e1 = new ElectricCar();
        ElectricCar e2 = new ElectricCar();
        ElectricCar e3 = new ElectricCar();

        e1.start();
        e1.drive();
        e1.charge();

        System.out.println();

        e2.start();
        e2.drive();
        e2.charge();

        System.out.println();

        e3.start();
        e3.drive();
        e3.charge();
    }
}
