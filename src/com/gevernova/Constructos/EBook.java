package com.gevernova.Constructos;
// Base Book class
class Book {
    public String ISBN;          // accessible everywhere
    protected String title;      // accessible in subclass
    private String author;       // accessible only in this class

    public Book(String ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }

    // Set author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Get author name
    public String getAuthor() {
        return author;
    }
}

// Subclass demonstrating access modifiers
public class EBook extends Book {

    public EBook(String ISBN, String title) {
        super(ISBN, title);
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);     // public – accessible
        System.out.println("Title: " + title);   // protected – accessible
        // System.out.println("Author: " + author); // private – NOT accessible directly
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("123-456789", "A Game of Thrones");
        ebook.setAuthor("George RR Martin");

        ebook.displayEBookDetails();
        System.out.println("Author: " + ebook.getAuthor());  // Access via method
    }
}

