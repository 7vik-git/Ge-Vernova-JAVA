package com.gevernova.thisstatic.bank;

public class BankAccount {

//    declaring all the variables that will be used in the Class
    static final String bankName = "The Continental Bank";
    private static int totalAccounts = 0;
    private final String accountHolderName;
    private final long accountNumber;
    private double balance;

//    Parameterised Constructor
    public BankAccount(String accountHolderName, long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance=balance;
        totalAccounts++;
    }

//    method to check total no of accounts in the bank

    public static void getTotalAccounts(){
        System.out.println(totalAccounts);
    }

//    displays all the details of the account

    public void displayDetails(Object obj){
        if(obj instanceof BankAccount){
            System.out.println("******** " +bankName + " ********");
            System.out.println("Account Holder Name : " + accountHolderName);
            System.out.println("Account Number : "+accountNumber);
            System.out.println("Balance : " + balance +"$");
        }
    }

}
