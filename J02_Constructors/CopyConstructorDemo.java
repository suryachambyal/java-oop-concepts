package J02_Constructors;

// Demonstrating Copy Constructor
class Book {

    // Instance variable
    String title;

    // Parameterized constructor
    Book(String title) {
        this.title = title;
    }

    // Copy constructor
    Book(Book b) {
        this.title = b.title;
    }

    // Method to display book title
    void display() {
        System.out.println("Book Title : " + title);
    }
}

public class CopyConstructorDemo {

    public static void main(String[] args) {

        // Creating original objects
        Book b1 = new Book("Atomic Habits");
        Book b2 = new Book("Rich Dad Poor Dad");
        Book b3 = new Book("Deep Work");

        // Creating copied objects
        Book copy1 = new Book(b1);
        Book copy2 = new Book(b2);
        Book copy3 = new Book(b3);

        // Displaying copied object data
        copy1.display();
        copy2.display();
        copy3.display();
    }
}