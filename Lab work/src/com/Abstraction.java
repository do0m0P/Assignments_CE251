package com;

import java.util.Date;

abstract class GeometricObject{
    private String color;
    private boolean filled=false;
    Date date = new Date();

    protected GeometricObject(){}

    protected GeometricObject(String clr, boolean fl){
        color = clr;
        filled = fl;
    }

    public String getColor() {
        return color;
    }

    public Date getDate() {
        return date;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
        setFilled(true);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public abstract double getArea();
    public abstract double getPerimeter();

}

class Circle extends GeometricObject{
    double radius;
    Circle(){}
    Circle(double rad){
        radius = rad;
    }
    Circle(double rad, String clr, boolean fld){
        super(clr,fld);
        radius = rad;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 6.28*radius;
    }
}
class Rectangle extends GeometricObject{
    double width;
    double height;

    Rectangle(){
    }
    Rectangle(double wd, double h){
        width = wd;
        height = h;
    }
    Rectangle(double wd, double h, String clr, boolean fld){
        super(clr,fld);
        width = wd;
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+height);
    }

    @Override
    public double getArea() {
        return width*height;
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Circle C1 = new Circle();
        Circle C2 = new Circle(10);
        Circle C3 = new Circle(20,"Red",true);
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle(10,20);
        Rectangle R3 = new Rectangle(30,40,"Yellow",true);

        System.out.println("C1: ");
        C1.setRadius(2);
        //C1.setColor("Blue");

        System.out.println(C1.getArea());
        System.out.println(C1.getPerimeter());
        System.out.println(C1.isFilled());
        System.out.println(C1.getColor());

        System.out.println("C2: ");
        C2.setColor("Black");

        System.out.println(C2.getArea());
        System.out.println(C2.getPerimeter());
        System.out.println(C2.isFilled());
        System.out.println(C2.getColor());

        System.out.println("C3: ");
        System.out.println(C3.getArea());
        System.out.println(C3.getPerimeter());
        System.out.println(C3.isFilled());
        System.out.println(C3.getColor());

        System.out.println("R1: ");
        R1.setHeight(20);
        R1.setWidth(10);
        R1.setColor("Green");
        //R1.setFilled(true);
        System.out.println(R1.getArea());
        System.out.println(R1.getPerimeter());
        System.out.println(R1.isFilled());
        System.out.println(R1.getColor());

        System.out.println("R2: ");
        R2.setColor("Violet");
        //R2.setFilled(false);
        System.out.println(R2.getArea());
        System.out.println(R2.getPerimeter());
        System.out.println(R2.isFilled());
        System.out.println(R2.getColor());

        System.out.println("R3: ");
        System.out.println(R3.getArea());
        System.out.println(R3.getPerimeter());
        System.out.println(R3.isFilled());
        System.out.println(R3.getColor());


    }
}
