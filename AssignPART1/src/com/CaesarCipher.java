package com.CaesCipher;
/*
21CE043_AAYUSHJANSARI
Implement Caesar Cipher
 */
import java.util.Scanner;

public class CaesarCipher {

    public static StringBuffer Cipher(String text, int s)
    {
        StringBuffer result= new StringBuffer();
        for (int i=0; i<text.length(); i++){
            if (Character.isUpperCase(text.charAt(i))){
                char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);
                result.append(ch);
            }
            else {
                char ch = (char)(((int)text.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int ROT_value;
        String str = new String();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = sc.next();
        System.out.print("Enter rotating value: ");
        ROT_value = sc.nextInt();

        System.out.print("\n\nAfter using caeser cipher: " + Cipher(str,ROT_value));

    }
}
