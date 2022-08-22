package com;

interface P{
    int P=1;
    void P();//Prints P
}
interface P1 extends P{
    int P1 = 10;
    void P1();//Prints P1
}
interface P2 extends P{
    int P2 = 20;
    void P2();//Prints P2
}
interface P12 extends P1,P2{
    int P12 = 120;
    void P12();//Prints P12
}

class Q implements P12{
    public void P12(){
        System.out.println(P12);
    }

    @Override
    public void P2() {
        System.out.println(P2);
    }

    @Override
    public void P1() {
        System.out.println(P1);
    }

    @Override
    public void P() {
        System.out.println(P);
    }
}

public class interface_Inheritance {
    public static void main(String[] args) {
        Q q = new Q();
        q.P();
        q.P1();
        q.P2();
        q.P12();
    }
}
