package J06_Polymorphism;

// Demonstrating Method Overloading

class Printer {

    void print(String text) {
        System.out.println("Printing text : " + text);
    }

    void print(int number) {
        System.out.println("Printing number : " + number);
    }

    void print(double value) {
        System.out.println("Printing decimal : " + value);
    }
}

public class MethodOverloadingDemo {

    public static void main(String[] args) {

        Printer p1 = new Printer();

        p1.print("Java");
        p1.print(100);
        p1.print(99.99);
    }
}

