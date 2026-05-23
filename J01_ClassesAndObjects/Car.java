package J01_ClassesAndObjects;

public class Car {

    // Instance variables
    String brand;
    String model;
    int speed;

    // Method to start car
    void startCar() {
        System.out.println(brand + " " + model + " is starting...");
    }

    // Method to display speed
    void showSpeed() {
        System.out.println("Current speed : " + speed + " km/h");
    }

    public static void main(String[] args) {

        // Creating first Car object
        Car car1 = new Car();

        // Assigning values
        car1.brand = "BMW";
        car1.model = "M5";
        car1.speed = 250;

        // Calling methods
        car1.startCar();
        car1.showSpeed();

        System.out.println();

        // Creating second Car object
        Car car2 = new Car();

        car2.brand = "Porsche";
        car2.model = "911 Carrera";
        car2.speed = 290;

        car2.startCar();
        car2.showSpeed();

        System.out.println();

        // Creating third Car object
        Car car3 = new Car();

        car3.brand = "Mercedes";
        car3.model = "AMG GT";
        car3.speed = 315;

        car3.startCar();
        car3.showSpeed();
    }
}