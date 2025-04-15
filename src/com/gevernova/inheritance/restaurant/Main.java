package com.gevernova.inheritance.restaurant;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Waiter("Stuart", 22, "Serves Customers");
        Worker  worker2 = new Chef("Subash", 35, "Cooks Food");
        worker1.implementsDuties();

    }
}
