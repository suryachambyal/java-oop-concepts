package J04_Inheritance;

// Demonstrating Hierarchical Inheritance

class Person {

    void displayRole() {
        System.out.println("This is a person.");
    }
}

class Student extends Person {

    void study() {
        System.out.println("Student is studying...");
    }
}

class Teacher extends Person {

    void teach() {
        System.out.println("Teacher is teaching...");
    }
}

public class HierarchicalInheritanceDemo {

    public static void main(String[] args) {

        // Creating Student object
        Student s1 = new Student();

        // Creating Teacher object
        Teacher t1 = new Teacher();

        s1.displayRole();
        s1.study();

        System.out.println();

        t1.displayRole();
        t1.teach();
    }
}
