// Write a method public static int readInFile(String line, File file) that returns the
// position number of a line in the file filename or −1 if there is no such line or file.
// Assume that this file contains names of people with a name per line. Names (and
// hence lines) are listed in ascending alphabetical order in the file. We can not find the
// same line twice.
import java.io.*;
class pr7 {
    File readInFile = new File("text.txt");

    int readFileme(String line, File file) {
        if (readInFile.exists()) {
            return line.length();
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        String str = "File Handling in Java using FileWriter and FileReader";

        FileWriter writeInFile = new FileWriter("text.txt");
        for (int i = 0; i < str.length(); i++)
            writeInFile.write(str.charAt(i));

        System.out.println("Writing successful");
        writeInFile.close();
        int ch;

        FileReader readInFile = new FileReader("text.txt");
        System.out.println("File created Successfully");

        System.out.println("File is found");

        while ((ch = readInFile.read()) != -1)
            System.out.print((char) ch);


        readInFile.close();
    }
}