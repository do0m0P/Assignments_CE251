package com.Basics;

import java.io.*;

public class pr5 {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("Even.txt");
        BufferedWriter bw = new BufferedWriter(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<15;i++){
            int a = Integer.parseInt(reader.readLine());

            if(a%2 == 0){
                bw.write(String.valueOf(a));
            }
        }
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("Even.txt"));
        System.out.println(br.readLine());

    }
}


