
/*
Use the Account class created as above to simulate an ATM machine.
Create 10 accounts  with id 0 1 2.....10  with  initial balance 100₹.
The system prompts the users to enter an id.
If the id is entered incorrectly, ask the  user  to  enter  a  correct  id.
Once  an  id  is  accepted,  display  menu  with multiple choices.
1.Balance inquiry
2.Withdraw money [Maintain minimum balance 300₹]
3.Deposit money
4.Exit
 */

import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pr1.Account[] Acc = new Pr1.Account[10];
        Acc[0] = new Pr1.Account();

        int i=0;
        while(true){
            System.out.print("Enter ID: ");
            int checker = sc.nextInt();
            if (checker >=0 && checker <10) {
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
            System.out.println("4: Exit");

            ch = sc.nextInt();

            switch (ch) {

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
                    System.out.println("Thank You");
                    System.exit(0);
                    break;

            }
        }
    }
}

