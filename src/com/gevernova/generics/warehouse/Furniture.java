package com.gevernova.generics.warehouse;

public class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture Item: " + getName());
    }
}
