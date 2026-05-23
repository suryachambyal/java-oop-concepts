package J06_Polymorphism;

// Demonstrating Method Overriding

class Vehicle {

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with self-start button.");
    }
}

public class MethodOverridingDemo {

    public static void main(String[] args) {

        Bike b1 = new Bike();

        b1.start();
    }
}
