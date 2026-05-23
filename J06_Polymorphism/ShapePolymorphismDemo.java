package J06_Polymorphism;

// Demonstrating Polymorphism using Shapes

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

public class ShapePolymorphismDemo {

    public static void main(String[] args) {

        Shape s1 = new Circle(7);
        Shape s2 = new Rectangle(10, 5);

        System.out.println("Area of Circle : " + s1.area());
        System.out.println("Area of Rectangle : " + s2.area());
    }
}
