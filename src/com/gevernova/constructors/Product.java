package com.gevernova.constructors;
// Represents a product in inventory
public class Product {
    private String productName;
    private double price;

    // shared among all Product objects
    private static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // increment when a product is created
    }

    // Display individual product details
    public void displayProductDetails() {
        System.out.println("Product: " + productName);
        System.out.println("Price: ₹" + price);
    }

    // Display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Legion 5", 95000);
        Product p2 = new Product("Safari Bag", 2500);

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();

        Product.displayTotalProducts();
    }
}

