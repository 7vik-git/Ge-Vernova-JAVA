package com.gevernova.classes;

// Represents a movie ticket
public class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    // Book a ticket by setting details
    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Display ticket information
    public void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat No: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();

        ticket.bookTicket("Inception", 12, 250);
        ticket.displayTicket();
    }
}

