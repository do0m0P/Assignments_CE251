package com.String;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

// String, Stringbuilder, Stringbuffer
//charAt,indexof,length,split,replace,tolower,toupper,compareto,comparetoignore,
public class str_methods {
    public static void main(String[] args) {
        char[] ch = {'a','b','c','d','e','f','g','h','i'};
        String st = new String(ch);
        String Str = new String("a This is a string");

        String Str3;
        //charAt(): return the character at the index
        System.out.println("chaAt() is used: "+Str.charAt(10));

        //compareto: return 0 if both are equal.
        //Else prints the difference between the length of invoking string to string inside the argument
        System.out.println("compareto() is used: "+st.compareTo(Str));

        //concat(): Since the string is an immutable datatype,
        // this function returns the concatated string which has to be stored in a different string
        Str3 = st.concat(Str);
        System.out.println("concat() is used: " + st.concat(Str));
        System.out.println(Str3);
        //contains(): returns true if the string block is contained in original string
        System.out.println("contains() is used: "+ Str.contains("This is a"));

        //ToLowerCase():
        System.out.println("toLowerCase() is used: " + Str.toLowerCase(Locale.ROOT));
        //toUpperCase()
        System.out.println("toUpperCase() is used: " + st.toUpperCase());
        //endsWith()
        System.out.println("endsWith() is used: " + st.endsWith("hi"));
        //equals()
        System.out.println("equals() is used: " + Str.equals(Str3));
        //equalsIgnoreCase()
        System.out.println("equalsIgnoreCase() is used: " + Str.equalsIgnoreCase(Str));
        //format()
        System.out.println("format() is used: "+ String.format("%s",Str));
        System.out.println("format() is used: " + String.format("%3.5f",12345.67890));
        //getbytes()
        // If the values are stored in a byte array, they will be ASCII values
        //If directly printed then the result will be jibberish(garbage values)
        byte [] barr = st.getBytes();
        for(int i=0;i<barr.length;i++){
            System.out.print(" "+  barr[i]);
        }
        System.out.println();
        System.out.println("getbytes() is used: " + st.getBytes(StandardCharsets.UTF_8));

        //getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)
        //can be used to extract elements from one String to a char array
        char[] carr = new char[10];
        st.getChars(2,8,carr,3);
        System.out.println("getChars() is used:  ");

        for(int i=0;i<10;i++){
            System.out.print(" "+carr[i]);
        }

        //indexOf()
        //indexOf(int ch) : returns index of given char
        //indexOf(int ch, int fromIndex) : returns index of given char after the offset
        //indexOf(String SubString): returns the index of given sub string
        //indexOf(String SubString, int fromIndex): returns the index of given String from entered offset
        System.out.println("indexOf() is used:");
        System.out.println(Str.indexOf('a'));
        System.out.println(Str.indexOf('a',3));
        System.out.println(Str.indexOf("is"));
        System.out.println(Str.indexOf("is",10));

        //intern()
        System.out.println("Before intern():");
        String Str4 = Str.intern();

        System.out.println(Str == Str4);
        //isEmpty()
        System.out.println("isEmpty() is used: " + Str.isEmpty());
        //isBlank()
        System.out.println("isBlank() is used: " + Str.isBlank());
        //join()
        String join = String.join("----","hello","world");
        System.out.println("join is used(): " + join);
        //lastIndexOf()
        System.out.println("lastIndexOf() is used: " + Str.lastIndexOf('S'));
        //length()
        System.out.println("length() is used: " + Str.length());
        //matches()
        System.out.println("matches() is used: " + Str.matches("is"));
        //replace()
        System.out.println("replace() is used: " + st.replace('a','Z'));
        //replaceAll()
        System.out.println("replaceAll() is used: " + Str.replaceAll("String","Jibberish"));
        //split()
        System.out.println("split() is used:  ");
        String[] words1 = Str.split(" ");
        for(int i=0;i<words1.length;i++){
            System.out.print(words1[i]+", ");
        }
        System.out.println();
        String[] words2 = join.split("----");
        for(int i=0;i<words2.length;i++){
            System.out.print(words2[i]+", ");
        }

    }

}
