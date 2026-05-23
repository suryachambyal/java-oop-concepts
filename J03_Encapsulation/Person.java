package J03_Encapsulation;

// Demonstrating Encapsulation using private fields,
// getters, setters, and validation logic

class Person {

    // Private fields (data hiding)
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {

        // Validation for empty or null values
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {

        // Validation for valid age
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    public static void main(String[] args) {

        // Creating Person objects
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        // Setting values using setter methods
        p1.setName("Charlie");
        p1.setAge(21);

        p2.setName("Thomas");
        p2.setAge(27);

        p3.setName("George");
        p3.setAge(25);

        // Displaying object details
        p1.displayInfo();
        System.out.println();

        p2.displayInfo();
        System.out.println();

        p3.displayInfo();
    }
}