package J04_Inheritance;

// Demonstrating Single Inheritance

class Animal {

    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class SingleInheritanceDemo {

    public static void main(String[] args) {

        // Creating Dog objects
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        d1.eat();
        d1.bark();

        System.out.println();

        d2.eat();
        d2.bark();

        System.out.println();

        d3.eat();
        d3.bark();
    }
}
