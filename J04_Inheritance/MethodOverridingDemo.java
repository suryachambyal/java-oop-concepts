package J04_Inheritance;

// Demonstrating Method Overriding

class Animal2 {

    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Cat extends Animal2 {

    @Override
    void sound() {
        System.out.println("Cat says Meow...");
    }
}

class Dog extends Animal2 {

    @Override
    void sound() {
        System.out.println("Dog says Woof...");
    }
}

class Duck extends Animal2 {

    @Override
    void sound() {
        System.out.println("Duck says Quack...");
    }
}

public class MethodOverridingDemo {

    public static void main(String[] args) {

        // Creating  objects
        Cat c1 = new Cat();
        Dog d2 = new Dog();
        Duck d3 = new Duck();

        c1.sound();
        d2.sound();
        d3.sound();
    }
}
