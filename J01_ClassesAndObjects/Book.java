package J01_ClassesAndObjects;

public class Book {

    // Instance variables
    String title;
    String author;
    int pages;

    // Method to display book details
    void displayBookInfo() {

        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Pages : " + pages);
    }

    public static void main(String[] args) {

        // Creating first object
        Book book1 = new Book();

        // Assigning values
        book1.title = "Atomic Habits";
        book1.author = "James Clear";
        book1.pages = 320;

        // Calling method using object
        book1.displayBookInfo();

        System.out.println();

        // Creating second object
        Book book2 = new Book();

        book2.title = "The Psychology Of Money";
        book2.author = "Morgan Housel";
        book2.pages = 256;

        book2.displayBookInfo();

        System.out.println();

        // Creating third object
        Book book3 = new Book();

        book3.title = "The Diary Of A CEO";
        book3.author = "Steven Bartlett";
        book3.pages = 368;

        book3.displayBookInfo();
    }
}