package com.gevernova.oodp.product;
public class ECommerceTest {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200);
        Product p2 = new Product("Mouse", 25);
        Product p3 = new Product("Keyboard", 45);

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        Order order1 = new Order(c1);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order(c2);
        order2.addProduct(p2);
        order2.addProduct(p3);

        c1.placeOrder(order1);
        c2.placeOrder(order2);

        System.out.println(order1);
        System.out.println(order2);

        System.out.println("\nAlice's Orders: " + c1.getOrderHistory());
        System.out.println("Bob's Orders: " + c2.getOrderHistory());
    }
}

