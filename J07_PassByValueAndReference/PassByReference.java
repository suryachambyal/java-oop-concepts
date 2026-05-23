package J07_PassByValueAndReference;

// Demonstrating Pass By Reference behavior using objects

class Dog {

    String name;
}

public class PassByReference {

    // Method to change dog name
    public static void changeName(Dog d) {

        d.name = "Tommy";

        System.out.println("Inside Method : " + d.name);
    }

    public static void main(String[] args) {

        // Creating Dog object
        Dog myDog = new Dog();

        // Assigning initial name
        myDog.name = "Charlie";

        System.out.println("Before Method Call : " + myDog.name);

        // Passing object reference to method
        changeName(myDog);

        System.out.println("After Method Call : " + myDog.name);
    }
}