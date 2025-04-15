package com.gevernova.encapsulation.banking;

public class CurrentAccount extends BankAccount implements Loanable{
    private double interestRate;
    protected CurrentAccount(long accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void showDetails(){
        System.out.println("Name: "+ accountHolder);
        System.out.println("Account number : " + accountNumber);
        System.out.println("Balance " + balance);
        System.out.println("Interest Rate : " + getInterest());
    }

    public double getInterest(){
        return calculateInterest(0);
    }
    @Override
    public double calculateInterest(int interest) {
        return 10.1;
    }

    @Override
    public void applyForLoan(double amount) {
        if(calculateLoanEligibility(amount)){
            System.out.println("Congrats your Loan is Approved");
        }else{
            System.out.println("Sorry your loan application is rejected");
        }
    }

    @Override
    public boolean calculateLoanEligibility(double amount) {
        if(amount/getBalance()<10){
            return true;
        }
        return false;
    }
}
