package J07_PassByValueAndReference;

// Demonstrating Pass By Value using primitive data types

public class PassByValue {

    // Method to modify value
    public static void modify(int x) {

        x = 50;

        System.out.println("Inside Method : " + x);
    }

    public static void main(String[] args) {

        // Original variable
        int a = 10;

        System.out.println("Before Method Call : " + a);

        // Passing value to method
        modify(a);

        System.out.println("After Method Call : " + a);
    }
}