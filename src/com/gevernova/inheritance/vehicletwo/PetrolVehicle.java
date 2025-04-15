package com.gevernova.inheritance.vehicletwo;


public class PetrolVehicle extends Vehicle implements Refuelable{
    public PetrolVehicle(int maxSpeed, String model){
        this.maxSpeed=maxSpeed;
        this.model=model;
    }

    @Override
    public void reFuel() {
        System.out.println("refueling Petrol!!");
    }
}
