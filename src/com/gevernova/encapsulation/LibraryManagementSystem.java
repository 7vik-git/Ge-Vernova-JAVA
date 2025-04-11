package com.gevernova.encapsulation;
import java.util.*;

// Interface for reservable items
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract class for library items
abstract class LibraryItem implements Reservable {
    private String itemId;
    private String title;
    private String author;

    // Encapsulated borrower details
    private String borrowerName;
    private boolean isReserved;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
    }

    // Abstract method to be implemented by subclasses
    public abstract int getLoanDuration();

    // Concrete method to get details
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Reserved: " + (isReserved ? "Yes, by " + borrowerName : "No"));
    }

    // Encapsulation: Borrower details are not directly exposed
    protected String getBorrowerName() {
        return borrowerName;
    }

    // Interface implementation
    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            this.borrowerName = borrowerName;
            isReserved = true;
            System.out.println("Item reserved successfully for " + borrowerName);
        } else {
            System.out.println("Item already reserved by " + this.borrowerName);
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Subclass: Book
class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books can be loaned for 14 days
    }
}

// Subclass: Magazine
class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines for 7 days
    }
}

// Subclass: DVD
class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // DVDs for 3 days
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();

        libraryItems.add(new Book("B001", "Clean Code", "Robert C. Martin"));
        libraryItems.add(new Magazine("M001", "National Geographic", "Various"));
        libraryItems.add(new DVD("D001", "Inception", "Christopher Nolan"));

        // Reserve some items
        libraryItems.get(0).reserveItem("Amit Sharma");
        libraryItems.get(2).reserveItem("Riya Mehta");

        // Display details using polymorphism
        for (LibraryItem item : libraryItems) {
            System.out.println("-------------");
            item.getItemDetails();
        }
    }
}
