package com.gevernova.encapsulation;
import java.util.*;

// Interface for GPS tracking
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract base class for all vehicles
abstract class Vehicles implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicles(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per km: ₹" + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    // Encapsulation: getters only
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // GPS interface methods
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Subclass: Car
class Car extends Vehicles {
    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; // ₹50 base fare for cars
    }
}

// Subclass: Bike
class Bike extends Vehicles {
    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // No base fare for bikes
    }
}

// Subclass: Auto
class Auto extends Vehicles {
    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20; // ₹20 base fare for autos
    }
}

// Main1 class
public class RideHailingApp {
    // Method to calculate fare using polymorphism
    public static void processRide(Vehicles vehicle, double distance) {
        System.out.println("-----------");
        vehicle.getVehicleDetails();
        System.out.println("Fare for " + distance + " km: ₹" + vehicle.calculateFare(distance));
    }

    public static void main(String[] args) {
        List<Vehicles> availableRides = new ArrayList<>();

        availableRides.add(new Car("CAR101", "Ravi", 15, "MG Road"));
        availableRides.add(new Bike("BIKE202", "Meena", 8, "Brigade Road"));
        availableRides.add(new Auto("AUTO303", "Kumar", 10, "Koramangala"));

        double rideDistance = 5.0;

        for (Vehicles v : availableRides) {
            processRide(v, rideDistance);
        }
    }
}

