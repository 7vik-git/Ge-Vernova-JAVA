package com.gevernova.encapsulation.banking;

public class Main {
    public static void main(String[] args) {
        CurrentAccount acct1 = new CurrentAccount(69857521L, "Jon",895426.58);
        SavingsAccount acct2 = new SavingsAccount(985245625L,"Alex", 54793.52);
        acct1.showDetails();
        acct2.showDetails();
        acct1.applyForLoan(50000);
        acct2.applyForLoan(450000);
    }
}
