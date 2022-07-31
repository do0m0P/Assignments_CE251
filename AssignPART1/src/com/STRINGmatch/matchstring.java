package com.STRINGmatch;
import java.util.Scanner;
/*
21CE043_AAYUSHJANSARI
Given 2 strings, a and b, return the number of the positions
where they contain the same length 2 substring.
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings
appear in the same place in both strings.

stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
 */
public class matchstring {
    public static int stringMatch(String st1, String st2){
        int cnt=0;
        int minlen;
        if(st1.length() < st2.length())
            minlen = st1.length();
        else
            minlen = st2.length();

        for(int i=0; i<minlen-1 ; i++){
            if(st1.charAt(i)== st2.charAt(i) && st1.charAt(i+1)==st2.charAt(i+1))
                cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        String Str1 = new String();
        String Str2 = new String();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        Str1 = sc.next();
        System.out.print("Enter Second String: ");
        Str2 = sc.next();

        System.out.println(stringMatch(Str1,Str2));
    }
}
