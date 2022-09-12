package Pr2_Throws;


class SampleException extends Exception{
    SampleException(String s){
        super(s);
    }
}
public class Throw {
    static double Divide(double a, double b) throws ArithmeticException{
        throw new ArithmeticException("From func");
        //return a/b;
    }
    public static void main(String[] args) {
        try{
            throw new SampleException("This is an exception......");
        }catch(SampleException e){
            System.out.println(e);
        }
        try{
            double x = Divide(10,0);
        }catch(ArithmeticException e){
            System.out.println("Throws keyword used: ");
            System.out.println(e.getMessage());
        }

    }


}
