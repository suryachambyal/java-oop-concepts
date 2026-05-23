package J04_Inheritance;

// Demonstrating use of super keyword

class Employee {

    String company = "Google";

    void work() {
        System.out.println("Employee is working...");
    }
}

class Developer extends Employee {

    String company = "Microsoft";

    void showCompany() {

        // Accessing parent class variable
        System.out.println("Parent Company : " + super.company);

        // Accessing child class variable
        System.out.println("Child Company : " + company);
    }

    @Override
    void work() {

        // Calling parent class method
        super.work();

        System.out.println("Developer is writing code...");
    }
}

public class SuperKeywordDemo {

    public static void main(String[] args) {

        Developer d1 = new Developer();

        d1.showCompany();

        System.out.println();

        d1.work();
    }
}
