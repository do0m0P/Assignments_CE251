package com;

import java.util.Scanner;
import java.util.Vector;

interface IPrinter{
    boolean printable = false;
    void print();
}
interface IScanner{
    void scan(int num, String str);
    boolean scanned = false;
}
class Test implements IPrinter,IScanner{
    int n=0;
    String str;
    public void print(){
        System.out.println("Num: " + n);
        System.out.println("Str: " + str);
    }
    public void scan(int num,String Str){
        this.str = Str;
        n = num;
        //System.out.println("Scanned");
//        System.out.println(scanned);
    }
}
public class interfaces {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        Test t4 = new Test();
        Test t5 = new Test();
        Vector<Test> v = new Vector<Test>(5);

        v.add(t1);
        v.add(t2);
        v.add(t3);
        v.add(t4);
        v.add(t5);
        System.out.println(v);
        Scanner sc = new Scanner(System.in);
        int num;
        String str;
        for (Test obj:v) {
            System.out.print("Enter Num: ");
            num = sc.nextInt();
            System.out.print("Enter String: ");
            str = sc.next();
            obj.scan(num,str);
        }
        for (Test obj: v) {
            obj.print();
        }

        System.out.println(v);
    }
}
