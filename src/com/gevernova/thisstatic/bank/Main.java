package com.gevernova.thisstatic.bank;
public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Wick",6739493048L, 59752.75);
        BankAccount account2 = new BankAccount("John Wick", 6739493048L, 59752.75);
        BankAccount account3 = new BankAccount("Viggo Tarasov", 8465930201L, 150000.00);
        BankAccount account4 = new BankAccount("Sofia", 9456748392L, 120000.00);
        BankAccount account5 = new BankAccount("The Continental", 7986541230L, 1000000.00);
        BankAccount account6 = new BankAccount("Marcus", 7638291542L, 50000.00);
        BankAccount account7 = new BankAccount("Winston", 8036542917L, 2000000.00);
        BankAccount account8 = new BankAccount("Charon", 9348501983L, 80000.00);
        BankAccount account9 = new BankAccount("Ares", 8374659203L, 250000.00);
        BankAccount account10 = new BankAccount("Zero", 6748392950L, 85000.00);
        BankAccount account11 = new BankAccount("The Bowery King", 7654298394L, 500000.00);
        BankAccount account12 = new BankAccount("Frenk", 8273642905L, 62000.00);
        System.out.println(BankAccount.bankName);
        BankAccount.getTotalAccounts();
        account1.displayDetails(account1);
        account4.displayDetails(account5);
    }
}
