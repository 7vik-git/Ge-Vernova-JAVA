package com.gevernova.encapsulation.banking;

public abstract class BankAccount {
    protected long accountNumber;
    protected String accountHolder;
    protected double balance;

    protected BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void depositMoney(double money){
        balance+=money;
    }
    public void withdrawMoney(double money){
        if(money<balance){
            balance-=money;
        }
    }
    public abstract double calculateInterest(int interest);

}
