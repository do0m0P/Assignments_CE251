interface Colorable {
    static void howToColor() {
    }
}
class Geometricobject implements Colorable {
    static void howToColor() {
        System.out.println("Color of the each side is Green");
    }
}

class Square extends Geometricobject {
    private double side1 = 0;

    Square() {
        System.out.println("The Default Square is :");
        System.out.println("The area of square is : " + side1 * side1);
        System.out.println();
    }

    public double getside1() {
        return side1;
    }

    public void setside1(double side1) {
        this.side1 = side1;
    }

    public void area() {
        System.out.println("The Square Successfully Created!!!!");
        System.out.println("The area of square is : " + this.side1 * this.side1);
    }
}
public class pr9 extends Geometricobject {
    public static void main(String[] args) {
        Square s = new Square();
        s.setside1(10);
        s.getside1();
        s.area();
    }
}