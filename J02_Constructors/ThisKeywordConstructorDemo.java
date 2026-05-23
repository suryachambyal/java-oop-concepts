package J02_Constructors;

// Demonstrating use of 'this' keyword
class Person {

    // Instance variables
    String name;
    int age;

    // Constructor using this keyword
    Person(String name, int age) {

        // Referring current object variables
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void display() {
        System.out.println("Person Name : " + name);
        System.out.println("Person Age  : " + age);
        System.out.println();
    }
}

public class ThisKeywordConstructorDemo {

    public static void main(String[] args) {

        // Creating first object
        Person p1 = new Person("Oliver", 24);

        // Creating second object
        Person p2 = new Person("Ethan", 29);

        // Creating third object
        Person p3 = new Person("Sophia", 22);

        // Displaying person details
        p1.display();
        p2.display();
        p3.display();
    }
}