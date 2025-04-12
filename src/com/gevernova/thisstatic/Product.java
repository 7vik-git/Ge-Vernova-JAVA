package com.gevernova.thisstatic;
public class Product {

    // Static variable for discount shared across all products
    static double discount = 10.0; // Default 10% discount

    // Final variable to ensure unique and immutable product ID
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' keyword to initialize values
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%");
    }

    // Method to display product details after instanceof check
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Invalid product object.");
        }
    }

    // Main1 method to demonstrate functionality
    public static void main(String[] args) {
        Product product1 = new Product("P001", "Wireless Mouse", 25.99, 2);
        Product product2 = new Product("P002", "Mechanical Keyboard", 79.49, 1);

        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();

        Product.updateDiscount(15.0); // Update discount for all products

        System.out.println("\nAfter updating discount:");
        product1.displayProductDetails();
    }
}

