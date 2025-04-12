package com.gevernova.encapsulation;
import java.util.*;

interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private String borrower;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() { return itemId; }
    public void setItemId(int itemId) { this.itemId = itemId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getBorrower() { return borrower; }
    public void setBorrower(String borrower) { this.borrower = borrower; }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 21;
    }

    public void reserveItem(String borrower) {
        if (isAvailable) {
            setBorrower(borrower);
            isAvailable = false;
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }

    public void reserveItem(String borrower) {
        if (isAvailable) {
            setBorrower(borrower);
            isAvailable = false;
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem(String borrower) {
        if (isAvailable) {
            setBorrower(borrower);
            isAvailable = false;
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem item1 = new Book(1, "The Game of Thrones", "George RR Martin");
        LibraryItem item2 = new Magazine(2, "Harry Potter", "Bob");
        LibraryItem item3 = new DVD(3, "Inception", "Chris");

        Reservable r1 = (Reservable) item1;
        Reservable r2 = (Reservable) item2;
        Reservable r3 = (Reservable) item3;

        r1.reserveItem("User1");
        r2.reserveItem("User2");
        r3.reserveItem("User3");

        LibraryItem[] items = {item1, item2, item3};

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println("Available: " + ((Reservable) item).checkAvailability());
            System.out.println();
        }
    }
}
