package com.Constructor;
class Triangle{
    int choice,a,b,c;
    float s;
    double Area;
    int Perimtr;

    Triangle(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void Area(){
        s = (a+b+c)/2;
        Area = s*(s-a)*(s-b)*(s-c);
        Area = Math.sqrt(Area);
        System.out.println("Area is: " + Area);
    }
    public void Perimeter(){
        Perimtr = a+b+c;
        System.out.println("Perimeter is: " + Perimtr);
    }
}

class Rectangle{
    int l,w,perimtr;
    double Area;

    Rectangle(int a,int b){
        l = a;
        w = b;
    }
    public void Area(){
        Area = l*w;
        System.out.println("Area is: "+ Area);
    }
    public void Perimeter(){
        perimtr = 2*(l+w);
        System.out.println("Perimeter is: "+ perimtr);
    }
}
class Circle{
    int r;
    double Area;
    double Circumference;
    final double pi = 3.14;

    Circle(int Rad){
        r = Rad;
    }
    public void Area(){
        Area = pi*r*r;
        System.out.println("Area is: "+Area);
    }
    public void Circumfrn(){
        Circumference = 2*pi*r;
        System.out.println("Circumference is: " + Circumference);
    }
}
public class Area_Vol_etc {
    public static void main(String[] args) {
        Triangle T = new Triangle(1,2,3);
        Rectangle R = new Rectangle(4,5);
        Circle C = new Circle(10);
        T.Perimeter();
        T.Area();

        R.Perimeter();
        R.Area();

        C.Circumfrn();
        C.Area();


    }
}
