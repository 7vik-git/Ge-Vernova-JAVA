package com.gevernova.encapsulation.ride;

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
