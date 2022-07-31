package com.pattern;

import java.text.DecimalFormat;
/*
21CE043_AAYUSHJANSARI
Display numbers in a pyramid pattern.
              1
            1 2 1
          1 2 4 2 1
        1 2 4 8 4 2 1
      1 2 4 8 16 8 4 2 1
   1 2 4 8 16 32 16 8 4 2 1
1 2 4 8 16 32 64 32 16 8 4 2 1
 */
public class patternpow2 {
    public static void printpattern(int n){
        DecimalFormat df = new DecimalFormat("####");
        for(int i=0 ; i<n; i++){
            for (int j=n-i; j>0;j--){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++){
                //int num = (int)(Math.pow(2,j));
                //System.out.print(df.format(num)+" ");
                System.out.print((int)(Math.pow(2,j))+" ");
            }
            for (int j=i;j>=0;j--){
                //int num = (int)(Math.pow(2,j));
                System.out.print((int)(Math.pow(2,j))+" ");
                //System.out.print(df.format(num)+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        printpattern(8);
    }
}

