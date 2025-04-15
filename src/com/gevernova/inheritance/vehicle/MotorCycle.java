package com.gevernova.inheritance.vehicle;

public class MotorCycle extends Vehicle {
    int cubicCapacity;
    public MotorCycle(String fuel, int maxSpeed, int cc) {
        this.fuelType = fuel;
        this.cubicCapacity = cc;
        this.maxSpeed = maxSpeed;
    }
    @Override
    public void displayInfo() {
        System.out.println("Fuel Type of the MotorCycle is : " + fuelType);
        System.out.println("Cubic Capacity of Engine is : " + cubicCapacity + " CC");
        System.out.println("Max Speed is : " + maxSpeed + " kmph");
    }
}
