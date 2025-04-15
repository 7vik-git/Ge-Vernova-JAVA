package com.gevernova.inheritance.vehicletwo;

public class Main {
    public static void main(String[] args) {
        ElectricVehicle car1 = new ElectricVehicle("RS E-Tron", 269);
        Refuelable car2  = new PetrolVehicle(295, "RS7");
        car1.isElectric();
        car2.reFuel();
    }
}
