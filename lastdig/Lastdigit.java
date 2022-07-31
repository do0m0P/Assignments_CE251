package com.lastdig;
/*
21CE043_AAYUSHJANSARI
Given two non-negative int values,
return true if they have the same last digit, such as with 27 and 57.
Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
 */
import java.util.Scanner;
public class Lastdigit {
    public static boolean lastDigit(int a, int b){
        if(a%10 == b%10)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int Num1,Num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        Num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        Num2 = sc.nextInt();
        System.out.println(lastDigit(Num1, Num2));
    }
}
