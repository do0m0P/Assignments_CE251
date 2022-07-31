package com.stringOZ;

import java.util.Scanner;

/*
21CE043_AAYUSHJANSARI
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it is 'z',
so "ozymandias" yields "oz".startOz("ozymandias") → "oz"startOz("bzoo") → "z"startOz("oxx") → "o
 */
public class OZstring {
    public static String startOZ(String st) {
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'o' && st.charAt(i+1) == 'z')
                return "oz";
            else if (st.charAt(i) == 'o')
                return "o";
            else if (st.charAt(i) == 'z')
                return "z";

        }
        return "Not found";
    }
    public static void main(String[] args) {

        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.next();
        System.out.println(startOZ(str));
        System.out.println(startOZ("bzoo"));
        System.out.println(startOZ("oxx"));

    }

}
