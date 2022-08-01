package com.Practicals;

import java.util.Date;

public class Account {
    private String ID ;
    private double Balance = 300;
    private double AnnualInterestRate = 0.07;
    private final Date dateCreated = new Date();

    Account(){
        System.out.println("New account created....");
        Balance = 300;
        AnnualInterestRate = 0.07;
    }
    Account(String id, double bal){
        ID = id;
        Balance = bal;
    }

    public String getID() {
        return ID;
    }

    public double getBalance() {
        return Balance;
    }

    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        AnnualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterestRate(){
        return AnnualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return Balance * getMonthlyInterestRate() * 1;
    }

    public void withdraw(double withdrawAmt){
        Balance-=withdrawAmt;
        System.out.println("Amount withdrew: "+ withdrawAmt);
        System.out.println("New balance: " + Balance);
    }
    public void deposit(double depositAmt){
        Balance+=depositAmt;
        System.out.println("Amount deposited: ");
        System.out.println("New balance: " + Balance);
    }

    public void Transfer(Account trans,double amt){
        this.Balance-=amt;
        trans.setBalance(trans.getBalance()+amt);
        System.out.println("Amount transferred: ");
    }
}
