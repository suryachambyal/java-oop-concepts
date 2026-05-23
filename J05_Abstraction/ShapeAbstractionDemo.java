package J05_Abstraction;

// Demonstrating Abstraction using Shapes

abstract class Shape {

    abstract double area();
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }
}

class Rectangle extends Shape {

    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

public class ShapeAbstractionDemo {

    public static void main(String[] args) {

        Circle c1 = new Circle(7);
        Rectangle r1 = new Rectangle(10, 5);

        System.out.println("Area of Circle : " + c1.area());
        System.out.println("Area of Rectangle : " + r1.area());
    }
}
