package com.gevernova.inheritance.vehicletwo;

public class ElectricVehicle extends Vehicle{
    public ElectricVehicle(String model, int maxSpeed){
        this.maxSpeed=maxSpeed;
        this.model=model;
    }
    public void isElectric(){
        System.out.println("ReCharging!!");
    }
}
