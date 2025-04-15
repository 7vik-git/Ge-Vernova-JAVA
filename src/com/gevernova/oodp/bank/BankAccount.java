package com.gevernova.oodp.bank;
public class BankAccount {
    private static int accountCounter = 1000;
    private int accountNumber;
    private double balance;
    private Bank bank;
    private Customer customer;

    public BankAccount(Bank bank, Customer customer, double initialDeposit) {
        this.accountNumber = accountCounter++;
        this.bank = bank;
        this.customer = customer;
        this.balance = initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public Bank getBank() {
        return bank;
    }
}

