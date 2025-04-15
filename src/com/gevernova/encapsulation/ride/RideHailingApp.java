package com.gevernova.encapsulation.ride;
import java.util.*;

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

