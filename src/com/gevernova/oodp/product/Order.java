package com.gevernova.oodp.product;
import java.util.*;

public class Order {
    private static int idCounter = 1;
    private int orderId;
    private List<Product> products;
    private Customer customer;

    public Order(Customer customer) {
        this.orderId = idCounter++;
        this.products = new ArrayList<>();
        this.customer = customer;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() { return products; }

    public double getTotalAmount() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public Customer getCustomer() { return customer; }

    @Override
    public String toString() {
        return "Order #" + orderId + " by " + customer.getName() + ": " + products + " | Total: $" + getTotalAmount();
    }
}

