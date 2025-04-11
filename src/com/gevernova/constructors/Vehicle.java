package com.gevernova.constructors;
// Models a vehicle registration system
public class Vehicle {
    private String ownerName;
    private String vehicleType;

    private static double registrationFee = 5000;  // fixed for all vehicles

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Display vehicle and owner details
    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    // Update registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Jon Wick", "Car");
        Vehicle v2 = new Vehicle("Ethan Hunt", "Bike");

        v1.displayVehicleDetails();
        System.out.println();

        Vehicle.updateRegistrationFee(6000);  // updating fee globally

        v2.displayVehicleDetails();
    }
}

