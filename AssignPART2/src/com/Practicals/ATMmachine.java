package com.Practicals;
/*
Use the Account class created as above to simulate an ATM machine.
Create 10 accounts  with id AC001.....AC010  with  initial balance 300₹.
The system prompts the users to enter an id.
If the id is entered incorrectly, ask the  user  to  enter  a  correct  id.
Once  an  id  is  accepted,  display  menu  with multiple choices.
1.Balance inquiry
2.Withdraw money [Maintain minimum balance 300₹]
3.Deposit money
4.Money Transfer
5.Create Account
6.Deactivate Account
7.Exit Hint: Use ArrayList, which is can shrink and expand with compared to Array.
 */

import java.util.Scanner;

public class ATMmachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] Acc = new Account[10];
        Acc[0] = new Account();
        Acc[1] = new Account();
        int i=0;
        while(true){
            System.out.print("Enter ID: ");
            String checker = sc.next();
        if (checker.startsWith("AC")) {
            Acc[i].setID(checker);
            break;
        }else{
            System.out.println("Enter valid input: ");
        }
        }
        while (true) {
            int ch;
            System.out.println("\n\nEnter your choice: ");
            System.out.println("1: Balance Inquiry");
            System.out.println("2: Withdraw money [Maintain minimum balance 300₹]");
            System.out.println("3: Deposit money");
            System.out.println("4: Money Transfer");
            System.out.println("5: Create Account");
            System.out.println("6: Deactivate Account");
            System.out.println("0: Exit");
            System.out.println("10: Change Account: ");
            ch = sc.nextInt();

            switch (ch) {
                case 0:
                    System.out.println("THANK YOU");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Your balance: " + Acc[i].getBalance());
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double amtwith = sc.nextDouble();

                    if (!(Acc[0].getBalance() - amtwith < 300)) {
                        Acc[i].withdraw(amtwith);
                        break;
                    } else {
                        System.out.println("Enter valid input");
                        break;
                    }
                case 3:
                    System.out.println("Enter Amount to deposit: ");
                    Acc[i].deposit(sc.nextDouble());
                    break;
                case 4:
                    System.out.println("Enter name Account number to transfer: ");
                    int index = sc.nextInt();
                    System.out.println("Enter amount to transfer: ");
                    double amt = sc.nextDouble();
                    Acc[i].Transfer(Acc[index - 1], amt);
                    break;
                case 5:
                    System.out.println("Enter Account ID to Create: ");
                    int in = sc.nextInt();
                    Acc[in] = new Account();
                    break;
                case 6:
                    Acc[i] = null;
                    break;
                case 10:
                    System.out.println("Enter account to Use: ");
                    i = sc.nextInt();

                    System.out.println("Switching to account " + i);
            }
        }
    }
}

