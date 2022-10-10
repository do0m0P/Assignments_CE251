package com.Basics;

import java.io.*;
/*
When to use Character stream over Byte stream?
In Java, characters are stored using Unicode conventions.
Character stream is useful when we want to process text files.
These text files can be processed character by character.
Character size is typically 16 bits.

When to use Byte stream over Character stream?
Byte oriented reads byte by byte.
A byte stream is suitable for processing raw data like binary files.
 */

public class pr2 {
    public static void main(String[] args) throws IOException {
        FileReader CharIn = new FileReader("Text1.txt");
        FileInputStream ByteIn = new FileInputStream("Text2.txt");
        int c,b;
        System.out.println("From Character Stream...");
        while ((c = CharIn.read()) != -1) {
            System.out.print((char) c);
        }

        System.out.println("\n\n\nFrom Byte Stream....");
        while ((b = ByteIn.read()) != -1) {
            System.out.print((char) b);
        }

    }

}
