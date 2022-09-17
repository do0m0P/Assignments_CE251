package com;


interface sayable{
    default void say(){
        System.out.println("hello world");
    }
}
public class defaut {
    public static void main(String[] args) {
        sayable s = new sayable() {
            @Override
            public void say() {
                sayable.super.say();
            }
        };
    }
}
