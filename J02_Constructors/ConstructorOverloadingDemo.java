package J02_Constructors;

class Car {

    String brand;
    int speed;

    // Default constructor
    Car() {
        brand = "Unknown";
        speed = 0;
    }

    // Constructor with one parameter
    Car(String brand) {
        this.brand = brand;
        this.speed = 180;
    }

    // Constructor with two parameters
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display object details
    void showInfo() {
        System.out.println("Car Brand : " + brand);
        System.out.println("Top Speed : " + speed + " km/h");
    }
}

public class ConstructorOverloadingDemo {

    public static void main(String[] args) {

        // Creating object using default constructor
        Car c1 = new Car();

        // Creating object using one parameter constructor
        Car c2 = new Car("BMW");

        // Creating object using two parameter constructor
        Car c3 = new Car("Ferrari", 340);

        c1.showInfo();

        System.out.println();

        c2.showInfo();

        System.out.println();

        c3.showInfo();
    }
}