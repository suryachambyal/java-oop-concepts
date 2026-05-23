package J05_Abstraction;

// Demonstrating Interface

interface Flyable {

    void fly();
}

class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird is flying...");
    }
}

class Airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Airplane is flying...");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Bird b1 = new Bird();
        Airplane a1 = new Airplane();

        b1.fly();

        System.out.println();

        a1.fly();
    }
}

