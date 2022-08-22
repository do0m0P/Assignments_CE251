package com.labexp;

public class append_elements_if_the_sum_is_5 {
    public static void main(String[] args) {
        int[] A = {4,2,1,4};
        int[] B = {1,4,4,1};
        int[] C = new int[8];
        int C_index=0;

        for(int i=0; i<4;i++){
            if(A[i]+B[i] == 5){
                C[C_index] = A[i];
                C[C_index+1] = B[i];
                C_index+=2;
            }
        }
        System.out.println("Elements in C:");
        for(int i=0; i<8;i++){
            if(C[i]!=0)
                System.out.println(C[i]+" ");
        }
    }
}
