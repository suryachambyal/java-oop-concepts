package J05_Abstraction;

// Demonstrating Abstract Class

abstract class Animal {

    // Abstract method
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog says Woof...");
    }
}

public class AbstractClassDemo {

    public static void main(String[] args) {

        // Creating Dog objects
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        d1.sound();
        d1.sleep();

        System.out.println();

        d2.sound();
        d2.sleep();

        System.out.println();

        d3.sound();
        d3.sleep();
    }
}

