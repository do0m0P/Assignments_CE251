package com.stringmaip;

public class stringmaipclass {
    public static void main(String[] args) {
        String str = "This is java programming lab This lab comes on Wednesday";
        String[] words = str.split(" ");
        String empty = new String();
        String str2= "This isis is is is is.... ....is....";
        //words = str2.split(" ");

        int Wordswith5ormore=0;
        int numOfIs=0;
        for (String word : words) {
            if (word.length() > 5)
                Wordswith5ormore++;
        }
        System.out.println("Words more than 5 letters are: " + Wordswith5ormore);

        for(int i=0;i < words.length; i++){
            if(words[i].contains("is"))
                numOfIs++;
        }
        System.out.println("Num of is: " + numOfIs);



    }
}
