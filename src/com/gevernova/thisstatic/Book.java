package com.gevernova.thisstatic;
public class Book {

    // Static variable shared by all books
    static String libraryName = "Central City Library";

    // Final variable to ensure ISBN is immutable
    private final String isbn;
    private String title;
    private String author;

    // Constructor using 'this' to resolve ambiguity
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details (with instanceof check)
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
            System.out.println("Library: " + libraryName);
        } else {
            System.out.println("Not a valid Book instance.");
        }
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "ISBN12345");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN67890");

        // Display book details
        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
        System.out.println();

        // Display library name
        Book.displayLibraryName();
    }
}

