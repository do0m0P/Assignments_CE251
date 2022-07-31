package com.removecharfromarray;
/*
21CE043_AAYUSHJANSARI
Given an array of strings, return a new array without the strings that are equal
to the target string. One approach is to count the occurrences of the target string,
make a new array of the correct length, and then copy over the correct strings.
wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
 */
public class removechar {
    public static String[] wordsWithout(String[] Strarr, String st){
        String[] newarr = new String[Strarr.length];
        int j=0;
        for(int i =0; i<Strarr.length;i++){
            if(Strarr[i].compareToIgnoreCase(st) != 0) {
                newarr[j] = Strarr[i];
                j++;
            }
        }
        return newarr;
    }
    public static void main(String[] args) {
        String[] str = {"a","b","c","a"};
        String[] nwarr = wordsWithout( str, "c");
        for(int i=0;i<nwarr.length;i++){
            if(nwarr[i] != null)
                System.out.print(nwarr[i]+" ");
        }
    }
}
