package J03_Encapsulation;

// Demonstrating Encapsulation using
// private fields, validation, and toString()

class Employee {

    // Private fields (data hiding)
    private String empName;
    private int empAge;
    private double empSalary;

    // Parameterized constructor
    public Employee(String empName, int empAge, double empSalary) {
        setEmpName(empName);
        setEmpAge(empAge);
        setEmpSalary(empSalary);
    }

    // Getter method for employee name
    public String getEmpName() {
        return empName;
    }

    // Setter method for employee name
    public void setEmpName(String empName) {

        // Validation for employee name
        if (empName != null && !empName.trim().isEmpty()) {
            this.empName = empName;
        } else {
            System.out.println("Please enter a valid employee name!");
        }
    }

    // Getter method for employee age
    public int getEmpAge() {
        return empAge;
    }

    // Setter method for employee age
    public void setEmpAge(int empAge) {

        // Validation for valid age
        if (empAge > 0 && empAge <= 100) {
            this.empAge = empAge;
        } else {
            System.out.println("Please enter a valid employee age!");
        }
    }

    // Getter method for employee salary
    public double getEmpSalary() {
        return empSalary;
    }

    // Setter method for employee salary
    public void setEmpSalary(double empSalary) {

        // Validation for valid salary
        if (empSalary > 0) {
            this.empSalary = empSalary;
        } else {
            System.out.println("Please enter a valid salary!");
        }
    }

    // Overriding toString() method
    @Override
    public String toString() {

        return "Employee {" +
                "Name = " + empName +
                ", Age = " + empAge +
                ", Salary = " + empSalary +
                "}";
    }

    public static void main(String[] args) {

        // Creating Employee objects
        Employee e1 = new Employee("Liam", 25, 60000);
        Employee e2 = new Employee("Noah", 24, 80000);
        Employee e3 = new Employee("Marcus", 27, 90000);

        // Displaying employee details
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println();

        // Accessing data using getter methods
        System.out.println("Employee Age    : " + e1.getEmpAge());
        System.out.println("Employee Name   : " + e2.getEmpName());
        System.out.println("Employee Salary : " + e3.getEmpSalary());
    }
}