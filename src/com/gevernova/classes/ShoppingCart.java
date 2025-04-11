package com.gevernova.classes;
import java.util.ArrayList;

// Represents a single item in the cart
class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }
}


public class ShoppingCart {
    private ArrayList<CartItem> items = new ArrayList<>();

    // Add item to cart
    public void addItem(CartItem item) {
        items.add(item);
    }

    // Remove item by name
    public void removeItem(String itemName) {
        items.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
    }

    // Display total cost
    public void displayTotal() {
        double total = 0;

        for (CartItem item : items) {
            total += item.getTotal();
        }

        System.out.println("Total Cost: ₹" + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new CartItem("Apple", 30, 2));
        cart.addItem(new CartItem("Milk", 50, 1));

        cart.removeItem("Apple");

        cart.displayTotal();
    }
}

