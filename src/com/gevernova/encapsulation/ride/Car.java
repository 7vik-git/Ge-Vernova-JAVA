package com.gevernova.encapsulation.ride;

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
