package com.Package;

public class test_calc {
    public static void main(String[] args) {
        Addition A = new Addition();
        Subtract S = new Subtract();
        Multiplication M = new Multiplication();
        Divide D = new Divide();
        System.out.println(A.Add(10,20));
        System.out.println(S.Sub(30,20));
        System.out.println(M.Multi(4,3));
        System.out.println(D.Div(8,2));
    }
}
