package com.StringBuffer;

public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Hello");
        StringBuffer str2 = new StringBuffer("World");
        StringBuffer str3 = new StringBuffer(30);
        System.out.println(str1.append(10));
        System.out.println(str3.capacity());
        System.out.println(str3.append(" Dark "));
        System.out.println(str3.length());
    }
}
