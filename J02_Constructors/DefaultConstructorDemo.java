package J02_Constructors;

// Demonstrating default constructor
class Student {

    // Default constructor
    Student() {
        System.out.println("Default Constructor Called");
    }

    // Method to display object creation message
    void displayMessage() {
        System.out.println("Student object created successfully");
    }
}

public class DefaultConstructorDemo {

    public static void main(String[] args) {

        // Creating first object
        Student s1 = new Student();
        s1.displayMessage();

        System.out.println();

        // Creating second object
        Student s2 = new Student();
        s2.displayMessage();

        System.out.println();

        // Creating third object
        Student s3 = new Student();
        s3.displayMessage();
    }
}