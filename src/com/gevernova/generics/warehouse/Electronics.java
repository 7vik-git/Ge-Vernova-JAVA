package com.gevernova.generics.warehouse;
public class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics Item: " + getName());
    }
}
