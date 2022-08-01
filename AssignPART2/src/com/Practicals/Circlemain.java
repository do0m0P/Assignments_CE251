package com.Practicals;

import java.util.Scanner;

/*
21CE043_AAYUSHJANSARI
Design a class named Circle containing following attributes and behavior.
•One double data field named radius. The default valueis1.
•A no-argument constructor that creates a default circle.
•A Single argument constructor that creates a Circle with the specified radius.
•A method named getArea() that returns area of the Circle.
•A method named getPerimeter() that returns perimeterof it.
 */
class Circle{
    final double pi=3.14;
    private double radius;

    Circle(){
        radius=0;
    }
    Circle(double rad){
        radius = rad;
        System.out.println("Circle created");
    }
    public double getArea(){
        return pi*radius*radius;
    }

    public double getPerimeter(){
        return 2*pi*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

public class Circlemain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle C1 = new Circle();
        Circle C2 = new Circle(10);
        System.out.print("Enter radius: ");
        double r= sc.nextDouble();
        C1.setRadius(r);
        System.out.println(C1.getArea());
        System.out.println(C2.getArea());
        System.out.println(C1.getPerimeter());
        System.out.println(C2.getPerimeter());

    }
}
