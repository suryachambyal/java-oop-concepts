package J05_Abstraction;

// Demonstrating Abstract Methods

abstract class Employee {

    // Abstract method
    abstract void work();

    // Concrete method
    void attendance() {
        System.out.println("Employee attendance marked.");
    }
}

class Developer extends Employee {

    @Override
    void work() {
        System.out.println("Developer is writing code...");
    }
}

class Designer extends Employee {

    @Override
    void work() {
        System.out.println("Designer is creating UI designs...");
    }
}

public class AbstractMethodDemo {

    public static void main(String[] args) {

        // Creating Developer object
        Developer d1 = new Developer();

        // Creating Designer object
        Designer d2 = new Designer();

        d1.work();
        d1.attendance();

        System.out.println();

        d2.work();
        d2.attendance();
    }
}