package J06_Polymorphism;

// Demonstrating Dynamic Method Dispatch

class Employee {

    void work() {
        System.out.println("Employee is working...");
    }
}

class Developer extends Employee {

    @Override
    void work() {
        System.out.println("Developer is writing code...");
    }
}

class Tester extends Employee {

    @Override
    void work() {
        System.out.println("Tester is testing the application...");
    }
}

public class DynamicMethodDispatchDemo {

    public static void main(String[] args) {

        Employee e1;

        e1 = new Developer();
        e1.work();

        System.out.println();

        e1 = new Tester();
        e1.work();
    }
}

