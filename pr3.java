package com.Basics;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pr3 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Text1.txt");
        File f2 = new File("Text2.txt");
        FileWriter fw1 = new FileWriter(f1);
        fw1.write("Hello World....... This is 21CE043 from text1.txt");
        f1.createNewFile();
        fw1.close();

        FileReader fr1 = new FileReader(f1);
        FileWriter fw2 = new FileWriter(f2);
        fw2.write(fr1.read());
        int i;
        while((i=fr1.read()) != -1) {
            fw2.write((char) i);
        }
        fr1.close();
        fw2.close();
    }
}
