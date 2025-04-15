package com.gevernova.encapsulation.banking;

public class SavingsAccount extends BankAccount implements Loanable{
    private int interest;

    protected SavingsAccount(long accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    public double getInterest(){
        if(getBalance()>1000000){
            return 8.7;
        }else{
            return 9.8;
        }
    }

    public void showDetails(){
        System.out.println("Name: "+ accountHolder);
        System.out.println("Account number : " + accountNumber);
        System.out.println("Balance " + balance);
        System.out.println("Interest Rate : " + getInterest());
    }

    @Override
    public double calculateInterest(int interest) {
        return getInterest();
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
        if(amount/getBalance()<15){
            return true;
        }
        return false;
    }
}
