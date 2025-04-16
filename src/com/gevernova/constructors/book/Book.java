package com.gevernova.constructors.book;

public class Book {
    private String title;
    private String author;
    private int price;
    private boolean isAvailable;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void isBookAvailable() {
        if (this.isAvailable) {
            System.out.println("Book is available");
        } else {
            System.out.println("Book is not available");
        }
    }

    public void borrowBook() {
        if (this.isAvailable) {
            this.isAvailable = false;
            System.out.println("Here is your book, pls pay a security deposit of " + this.price + "$");
        } else {
            System.out.println("Sorry the Book is out of Stock");
        }
    }

    public void returnBook() {
        this.isAvailable = true;
        System.out.println("Thank you for returning the Book in great condition");
    }
}
