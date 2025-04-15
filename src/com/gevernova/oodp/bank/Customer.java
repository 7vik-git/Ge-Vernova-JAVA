package com.gevernova.oodp.bank;
import java.util.*;

public class Customer {
    private String name;
    private List<BankAccount> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalances() {
        System.out.println("Accounts for " + name + ":");
        for (BankAccount acc : accounts) {
            System.out.println("  Account #" + acc.getAccountNumber() + " | Balance: $" + acc.getBalance() + " | Bank: " + acc.getBank().getName());
        }
    }

    public String getName() {
        return name;
    }
}

