package com.gevernova.encapsulation.ride;

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
