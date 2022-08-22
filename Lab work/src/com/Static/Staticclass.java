package com.Static;

import java.util.Scanner;

//this, super, static,
//USed for memory management
// Used with variable, methods, blocks
public class Staticclass {
    static int a;

    static void harmonic(int x){
        double ans=0;
        for(int i=1;i<=x;i++){
            ans += (1/(double)i);
            System.out.print("1/"+i );
            if(i!=x)
                System.out.print(" + ");
        }
        System.out.print(" = " + ans);
    }
    static{
        System.out.println("From static block:");
        a=5;
        harmonic(a);
    }

    public static void main(String[] args) {
        int A;
        Scanner sc = new Scanner(System.in);
        System.out.println("From main function:");
        A = sc.nextInt();
        harmonic(A);

    }
}
