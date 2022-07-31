package com.GradeandKey;
/*
21CE043_AAYUSHJANSARI
The problem is to write a program that will grade multiple-choice tests.
Assume there are eight students and ten questions, and the answers are stored in a two-dimensional array.
Each row records a student’s answers to the questions, as shown in the following array.
Students’ Answers to the Questions:
           0  1  2  3  4  5  6  7   8  9
Student 0  A  B  A  C  C  D  E  E  A  D
Student 1  D  B  A  B  C  A  E  E  A  D
Student 2  E  D  D  A  C  B  E  E  A  D
Student 3  C  B  A  E  D  C  E  E  A  D
Student 4  A  B  D  C  C  D  E  E  A  D
Student 5  B  B  E  C  C  D  E  E  A  D
Student 6  B  B  A  C  C  D  E  E  A  D
Student 7  E  B  E  C  C  D  E  E  A  D
The key is stored in a one-dimensional array:
Key to the Questions:
    0 1 2 3 4 5 6 7 8 9
Key D B D C C D A E A D
Your program grades the test and displays the result.
It compares each student’s answers with the key,
counts the number of correct answers, and displays it.
 */
public class Gradekey {

    public static void main(String[] args) {
        String[][] students = {{"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
                {"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
                {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
                {"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
                {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
                {"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"}};


        String[] key = {"D", "B", "D", " C", "C", "D", "A", "E", "A", "D"};
        gradestudent(students, key);

    }

    public static void gradestudent(String[][] stud, String[] k) {
        int[] grade = new int[8];
        for (int j = 0; j < 8; j++) {

            for (int i = 0; i < 10; i++) {
                if (k[i].equals(stud[j][i])) {
                    grade[j] += 1;
                }
            }
        }
        System.out.println("Grades are");
        for (int i = 0; i < 8; i++) {
            System.out.println("Student " + i + " ==> " + grade[i]);
        }
    }
}
