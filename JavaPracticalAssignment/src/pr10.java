class square {
    protected double side1;

    public double getside1() {
        return side1;
    }
    public void setside1(double side1) {
        this.side1 = side1;
    }

    public void area1() {
        System.out.println("The Square Area : ");
        System.out.println("The area of square is : " + this.side1 * this.side1);
    }
}

class ComparableSquare extends square implements Comparable{
    protected double side2;

    @Override
    public int compareTo(Object o) {
        if (o.equals(this))
            return 1;
        else
            return 0;

    }

    public double getside2() {
        return side2;
    }

    public void setside2(double side2) {
        this.side2 = side2;
    }

    public void area2() {
        System.out.println();
        System.out.println("The ColorableSquare Area : ");
        System.out.println("The area of square is : " + this.side2 * this.side2);
    }
}



class pr10 {    //test class
    public static void main(String[] args) {
        square s = new square();
        ComparableSquare Cs = new ComparableSquare();
        s.setside1(10);
        Cs.setside2(20);
        System.out.println(Cs.compareTo(s));

    }
}