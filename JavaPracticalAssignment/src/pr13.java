import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class pr13 {
    public static void sortArray(String[] student, int k) {

        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - i - 1; j++) {
                if (student[j].compareTo(student[j + 1]) > 0) {
                    String temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(student[i]);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {

        String student[] = new String[500];

        int counter = 0;
        File file = new File("text.txt");
        Scanner scnr = new Scanner(file);
        for (int i = 0; i < file.length(); i++) {
            while (scnr.hasNextLine()) {
                String line = scnr.nextLine();
                int flag = 0;
                for (int j = 0; j < counter; j++) {
                    if (line.compareTo(student[j]) == 0) {
                        flag = 1;
                        break;
                    }
                }

                if (flag == 0) {
                    student[counter] = line;
                    counter++;
                }
            }
        }
        System.out.println("the list of students in ascending order:");

        sortArray(student, counter);
    }
}