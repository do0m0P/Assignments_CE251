package com.Basics;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class pr1 {
    public static void main(String[] args) throws IOException {
        pr1 fm = new pr1();

        File f = new File("sample.txt");
        FileWriter fw = new FileWriter(f);
        System.out.println("getName:\t"+f.getName());
        System.out.println("getPath:\t"+f.getPath());
        System.out.println("getFilePath:\t" + f.getAbsolutePath());
        System.out.println("getCanonical Path:\t"+f.getCanonicalPath());
        System.out.println("canExecute:\t" + f.canExecute());
        System.out.println("canRead:\t"+f.canRead());
        System.out.println("canWrite:\t"+f.canWrite());
        System.out.println("getParent:\t"+f.getParent());
        System.out.println("getUsableSpace:\t"+f.getUsableSpace());
        System.out.println("getFreeSpace:\t"+f.getFreeSpace());
        System.out.println("getTotalSpace:\t"+f.getTotalSpace());

        fw.write("Hello world. This is Java Programming......");
        f.createNewFile();

        fw.close();

        FileReader fr = new FileReader(f);

        int i;
        while((i=fr.read()) != -1) {
            System.out.print((char)i);
        }
        fr.close();
        /*
        The below code will print next character always since fr.read() is used for conditions already.
        fr.read() inside the condition will return the character and
        hence the cursor will move to the next character when the fr.read() inside the sout is called.
        while((fr.read()) != -1) {
            System.out.print((char)fr.read());
        }

         */

        System.out.println("\ndelete:\t"+f.delete());

    }
}
