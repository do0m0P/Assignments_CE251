
// In an n-sided regular polygon, all sides have the same length and all angles have the
// same degree (i.e., the polygon is both equilateral and equiangular). Design a class
// named RegularPolygon that contains:
//  A private int data field named n that defines the number of sides in the
// polygon with default value 3.
//  A private double data field named side that stores the length of the side with
// default value 1.
//  A private double data field named x that defines the x-coordinate of the
// polygon’s center with default value 0.
//  A private double data field named y that defines the y-coordinate of the
// polygon’s center with default value 0.
//  A no-arg constructor that creates a regular polygon with default values.
//  A constructor that creates a regular polygon with the specified number of sides
// and length of side, centered at (0, 0).
//  A constructor that creates a regular polygon with the specified number of
// sides, length of side, and x- and y-coordinates.
//  The accessor and mutator methods for all data fields.
//  The method getPerimeter() that returns the perimeter of the polygon.
//  The method getArea() that returns the area of the polygon. The formula for
// computing the area of a regular polygon is:

class RegularPolygon {
    int n = 3;// number of sides
    double side = 1.00;// define length of side
    double x = 0;// defines the x-coordinate of the polygon’s center
    double y = 0;// defines the y-coordinate of the polygon’s center

    RegularPolygon() {
        System.out.println("The Regular polygon Is : ");
        System.out.println("The Polygon centered at (" + x + "," + y + ")");
        System.out.println("The default Perimeter of Polygon is : " + getPerimeter());
        System.out.println("The default Area of Polygon is : " + getArea());
        System.out.println();
    }

    // Accessor and Mutator
    int getNos() {
        //Accessor
        System.out.println("The Number Of side is : " + n);
        return n;
    }

    void setNos(int n) {
        this.n = n;
        //mutators
    }

    void getlos() {
        //Accessor
        System.out.println("The Length Of side is : " + side);
    }

    void setlos(Double side) {
        this.side = side;
        //mutators
    }

    public void getx() {
        //Accessor
        System.out.println("The value of x is : " + x);
    }

    public void setx(Double x) {
        this.x = x;
        //mutators
    }

    public void gety() {
        //Accessor
        System.out.println("The value of y is : " + y);
    }

    public void sety(Double y) {
        this.y = y;
        //mutators
    }

    // find perimeter
    double getPerimeter() {
        double perimeter = n * side;
        return perimeter;
    }
    //find Area
    double getArea() {
        double angle = Math.toRadians(180 / n);
        angle = Math.tan(angle);
        double area = ((side * side * n) / (4 * angle));
        return area;
    }

}

public class pr2 extends RegularPolygon {
    public static void main(String[] args) {
        RegularPolygon r = new RegularPolygon();
        r.setNos(5);
        r.getNos();
        r.setlos(10.00);
        r.getlos();
        r.setx(7.00);
        r.getx();
        r.sety(8.00);
        r.gety();
        System.out.println("The Perimeter of given Input is : " + r.getPerimeter());
        System.out.println("The Area of given Input is : " + r.getArea());

    }
}