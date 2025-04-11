package com.gevernova.thisstatic;
public class Vehicle {

    // Static variable shared by all vehicles
    static double registrationFee = 500.0; // Default registration fee

    // Final variable to ensure uniqueness of registration number
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' keyword to initialize variables
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: ₹" + registrationFee);
    }

    // Method to display vehicle registration details (with instanceof check)
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: ₹" + registrationFee);
        } else {
            System.out.println("Not a valid Vehicle instance.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John Doe", "Car", "MH12AB1234");
        Vehicle v2 = new Vehicle("Jane Smith", "Bike", "MH14XY5678");

        v1.displayRegistrationDetails();
        System.out.println();
        v2.displayRegistrationDetails();

        System.out.println("\nUpdating registration fee...\n");
        Vehicle.updateRegistrationFee(600.0);

        System.out.println();
        v1.displayRegistrationDetails();
    }
}

