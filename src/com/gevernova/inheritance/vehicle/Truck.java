package com.gevernova.inheritance.vehicle;

public class Truck extends Vehicle{
    int maxLoad;
    public Truck(String fuel, int maxSpeed, int maxLoad) {
        this.fuelType = fuel;
        this.maxLoad = maxLoad;
        this.maxSpeed = maxSpeed;
    }
        @Override
        public void displayInfo() {
            System.out.println("Fuel Type of the Truck is : " + fuelType);
            System.out.println("Max Load is : " + maxLoad + " tons");
            System.out.println("Max Speed is : " + maxSpeed + " kmph");
        }
}
