package com.gevernova.constructos;
// Models a car rental
public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private final double ratePerDay = 1000;  // fixed rate

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Calculate total rental cost
    public double calculateCost() {
        return rentalDays * ratePerDay;
    }

    // Display rental details
    public void displayRental() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateCost());
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("John Wick", "Ford Mustang", 50);
        rental.displayRental();
    }
}

