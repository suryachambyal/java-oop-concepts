package J03_Encapsulation;

// Demonstrating Getters and Setters
class Student {

    // Private variables (data hiding)
    private String name;
    private int marks;

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for marks
    public void setMarks(int marks) {

        // Validation check
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks!");
        }
    }

    // Getter method for marks
    public int getMarks() {
        return marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name  : " + name);
        System.out.println("Student Marks : " + marks);
        System.out.println();
    }
}

public class GettersSettersDemo {

    public static void main(String[] args) {

        // Creating first object
        Student s1 = new Student();
        s1.setName("Oliver");
        s1.setMarks(85);

        // Creating second object
        Student s2 = new Student();
        s2.setName("Sophia");
        s2.setMarks(92);

        // Creating third object
        Student s3 = new Student();
        s3.setName("Ethan");
        s3.setMarks(78);

        // Displaying student details
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
