package com.contain123;
/*
21CE043_AAYUSHJANSARI
Given an array of ints,
return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */
import java.util.Scanner;

public class ARRAY123 {
    public static boolean array123(int arr[]){
        for(int i=0; i < arr.length-2;i++){
            if(arr[i]==1 && arr[i+1]==2 && arr[i+2]==3)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size");
        size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("array123  is used: "+array123(arr));
    }
}
