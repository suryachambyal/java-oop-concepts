package J01_ClassesAndObjects;

public class Employee {

    // Instance variables
    String name;
    String department;
    double salary;

    // Method to display employee details
    void displayEmployeeDetails() {

        System.out.println("Name : " + name);
        System.out.println("Department : " + department);
        System.out.println("Salary : ₹" + salary);
    }

    public static void main(String[] args) {

        // Creating first Employee object
        Employee employee1 = new Employee();

        // Assigning values
        employee1.name = "Surya";
        employee1.department = "Software Development";
        employee1.salary = 75000;

        // Calling method
        employee1.displayEmployeeDetails();

        System.out.println();

        // Creating second Employee object
        Employee employee2 = new Employee();

        employee2.name = "Rahul";
        employee2.department = "Cyber Security";
        employee2.salary = 68000;

        employee2.displayEmployeeDetails();

        System.out.println();

        // Creating third Employee object
        Employee employee3 = new Employee();

        employee3.name = "Aman";
        employee3.department = "Cloud Computing";
        employee3.salary = 82000;

        employee3.displayEmployeeDetails();
    }
}
