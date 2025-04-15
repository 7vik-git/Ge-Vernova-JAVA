package com.gevernova.encapsulation.banking;

public interface Loanable {
    public void applyForLoan(double amount);
    public boolean calculateLoanEligibility(double amount);
}
