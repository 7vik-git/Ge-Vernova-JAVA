package com.gevernova.encapsulation;
import java.util.*;

// Interface for insurance-related features
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract base class for all vehicles
abstract class Vehicle implements Insurable {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber; // sensitive, should be encapsulated

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateRentalCost(int days);

    // Display common details
    public void displayDetails(int days) {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: ₹" + rentalRate + " per day");
        System.out.println("Rental Cost for " + days + " days: ₹" + calculateRentalCost(days));
        System.out.println("Insurance Cost: ₹" + calculateInsurance());
        System.out.println("Insurance Details: " + getInsuranceDetails());
    }

    // Getter methods (encapsulated)
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }
}

// Subclass for Car
class Car extends Vehicles {
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 0.1 * getRentalRate(); // 10% of daily rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance - Policy No: " + getInsurancePolicyNumber();
    }
}

// Subclass for Bike
class Bike extends Vehicles {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // 10% discount for bikes
    }

    @Override
    public double calculateInsurance() {
        return 0.05 * getRentalRate(); // 5% of daily rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance - Policy No: " + getInsurancePolicyNumber();
    }
}

// Subclass for Truck
class Truck extends Vehicles {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000; // ₹1000 loading fee
    }

    @Override
    public double calculateInsurance() {
        return 0.15 * getRentalRate(); // 15% of daily rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance - Policy No: " + getInsurancePolicyNumber();
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicles> rentals = new ArrayList<>();

        rentals.add(new Car("TG12AB1234", 1500, "CAR123456"));
        rentals.add(new Bike("TN14XY9876", 500, "BIKE654321"));
        rentals.add(new Truck("KA09TR4567", 3000, "TRUCK789012"));

        int rentalDays = 3;

        for (Vehicles v : rentals) {
            System.out.println("---------------");
            v.displayDetails(rentalDays);
        }
    }
}

