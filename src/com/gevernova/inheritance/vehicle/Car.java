package com.gevernova.inheritance.vehicle;

public class Car extends Vehicle{
    int seatCapacity;
    public Car(String fuel, int maxSpeed, int seats){
        this.fuelType = fuel;
        this.seatCapacity = seats;
        this.maxSpeed = maxSpeed;
    }
    @Override
    public void displayInfo() {
        System.out.println("Fuel Type of the Car is : "+ fuelType);
        System.out.println("Max Speed is : " + maxSpeed + "kmph");
        System.out.println("Seating Capacity is : " + seatCapacity);
    }
}
