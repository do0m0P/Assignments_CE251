package com.Practicals;
import java.util.Date;
import java.util.Scanner;

/*
Design a class named Account that contains:
•A private int data field named id for the account (default 0).
•A private double data field named balance for the account (default 500₹).
•A private double data field named annualInterestRate that
stores the current interest rate (default 7%). Assume all accounts have the same interest rate.
•A  private Date  data  field  named  dateCreated  that  stores  the  date  when  the account was created.
•A no-arg constructor that creates a default account.
•A constructor that creates an account with the specified id and initial balance.
•The accessor and mutator methods for id, balance, and annualInterestRate.
•The accessor method for dateCreated.
•A method named getMonthlyInterestRate() that returns the monthly interest rate.
•A method named getMonthlyInterest() that returns the monthly interest.
•A method named withdraw that withdraws a specified amount from the account.
•A method named deposit that deposits a specified amount to the account.
 */

public class Accoutnmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account Acc1 = new Account();
        Account Acc2 = new Account("AC001", 345000);
        System.out.print("Enter Account ID: ");
        Acc1.setID(sc.next());
        System.out.print("enter balance: ");
        Acc1.setBalance(sc.nextDouble());

        Acc1.setAnnualInterestRate(10);
        Acc2.setAnnualInterestRate(12);

        System.out.println("Enter amount to withdraw: \nACC1: \n");
        Acc1.withdraw(sc.nextDouble());
        System.out.print("ACC2: ");
        Acc2.withdraw(sc.nextDouble());
        System.out.println("Monthly interest rate: ");
        System.out.println(Acc1.getMonthlyInterestRate());
        System.out.println(Acc2.getMonthlyInterestRate());
        System.out.println("Monthly interest: ");
        System.out.println(Acc1.getMonthlyInterest());
        System.out.println(Acc2.getMonthlyInterest());

        System.out.println("Acc1 Details: ");
        System.out.println(Acc1.getID());
        System.out.println(Acc1.getBalance());
        System.out.println(Acc1.getDateCreated());

        System.out.println("\n\nAcc2 Details: ");
        System.out.println(Acc2.getID());
        System.out.println(Acc2.getBalance());
        System.out.println(Acc2.getDateCreated());

    }
}
