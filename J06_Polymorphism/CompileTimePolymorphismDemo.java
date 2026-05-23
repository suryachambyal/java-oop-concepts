// Compile-time polymorphism is also known as static polymorphism or early binding. Compile-time polymorphism is a polymorphism that is resolved during the compilation process. Overloading of methods is called through the reference variable of a class. Compile-time polymorphism is achieved by method overloading and operator overloading.

// Method Overloading occurs when a class has many methods with the same name but different parameters. Two or more methods may have the same name if they have other numbers of parameters, different data types, or different numbers of parameters and different data types.

package J06_Polymorphism;

// Demonstrating Compile-Time Polymorphism
class Calculator {

    // Method overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimePolymorphismDemo {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        System.out.println("Sum of two integers : "
                + c1.add(10, 20));

        System.out.println("Sum of two decimals : "
                + c1.add(12.5, 8.5));

        System.out.println("Sum of three integers : "
                + c1.add(5, 10, 15));
    }
}
