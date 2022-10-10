package com.Basics;

public class pr6 {
    public static void main(String[] args)
    {
        Integer I = Integer.valueOf("10");
        System.out.println(I);

        Double D = Double.valueOf("10.0");
        System.out.println(D);

        Boolean B = Boolean.valueOf("true");
        System.out.println(B);

        int i = Integer.parseInt("10");
        double d = Double.parseDouble("10.5");
        boolean b = Boolean.parseBoolean("true");

        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
        int j = Integer.parseInt("1000", 2);
        long l = Long.parseLong("1111", 4);

        System.out.println(j);
        System.out.println(l);

        String s = Integer.toString(10);
        System.out.println(s);

        String s1 = Character.toString('a');
        System.out.println(s1);
    }
}
