package J02_Constructors;

// Demonstrating Parameterized Constructor
class Employee {

    // Instance variables
    String name;
    int age;

    // Parameterized constructor
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Age  : " + age);
        System.out.println();
    }
}

public class ParameterizedConstructorDemo {

    public static void main(String[] args) {

        // Creating first object
        Employee e1 = new Employee("John Patrick", 27);

        // Creating second object
        Employee e2 = new Employee("Alex Chase", 32);

        // Creating third object
        Employee e3 = new Employee("Lewis Travis", 35);

        // Displaying employee details
        e1.display();
        e2.display();
        e3.display();
    }
}