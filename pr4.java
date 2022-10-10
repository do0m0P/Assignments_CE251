package com.Basics;
import java.io.*;
public class pr4 {
    public static void main(String[] args) throws IOException {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
        try {
            FileOutputStream test = new FileOutputStream("test.rtf");

            for(int i=0;i<10;i++){
                test.write((byte)i);
            }
            test.close();
            sourceStream = new FileInputStream("test.rtf");
            targetStream = new FileOutputStream("testcopy.rtf");
            int temp;
            while ((temp = sourceStream.read()) != -1) {
                targetStream.write((byte)temp);
            }
            System.out.print("Program successfully executed");
        }
        finally {

            if (sourceStream != null)
                sourceStream.close();

            if (targetStream != null)
                targetStream.close();
        }
    }
}
