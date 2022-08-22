package com.ExamResult;

import java.util.Scanner;

/*
Consider an example of declaring the examination result.
Design three classes: Student,Exam, Result.
Thw student class has data members such as those roll,name,etc.
Create a class Exam by inheriting Student class.
The exam class adds fields representing the marks scored in 6 subjects.
Derive result from the exam class, and it has its own fields such as totL_MARKS.
WRITE AN INTERACTIVE PROGRAM TO MODEL THIS RELATIONSHIP
*/
class Student{
    private String Name,Branch;
    private int Roll, Sem;
    //Getters
    public String getName() {
        return Name;
    }

    public int getRoll() {
        return Roll;
    }

    public int getSem() {
        return Sem;
    }

    public String getBranch() {
        return Branch;
    }
    //Setters
    public void setRoll(int roll) {
        Roll = roll;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public void setSem(int sem) {
        Sem = sem;
    }
}

class Exam extends Student{
    double mrkDCN;
    double mrkJava;
    double mrkMath;
    double mrkDE;
    double mrkHS;
    double mrkPython;
}
class Result extends Exam{
    double TotalMarks;

    Result(){}
    public double getMarks(){
        TotalMarks = mrkDCN + mrkJava + mrkMath + mrkDE + mrkHS + mrkPython;
        return TotalMarks;
    }
}

public class MainResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Student details block
        System.out.println("Enter Student details:");
        Result res = new Result();
        sc.nextLine();
        System.out.print("Name: ");

        res.setName(sc.nextLine());

        System.out.print("Roll no: ");
        res.setRoll(sc.nextInt());

        System.out.print("Branch: ");
        res.setBranch(sc.next());

        System.out.print("Sem: ");
        res.setSem(sc.nextInt());

        //Exam class block
        System.out.println("Enter Marks");
        System.out.print("DCN: ");
        res.mrkDCN = sc.nextDouble();
        System.out.print("JAVA: ");
        res.mrkJava = sc.nextDouble();
        System.out.print("Python: ");
        res.mrkPython = sc.nextDouble();
        System.out.print("Mathematics: ");
        res.mrkMath = sc.nextDouble();
        System.out.print("HS: ");
        res.mrkHS = sc.nextDouble();
        System.out.print("DE: ");
        res.mrkDE = sc.nextDouble();

        //Result block
        double marks = res.getMarks();
        System.out.println("Total marks = " + marks);

    }
}

