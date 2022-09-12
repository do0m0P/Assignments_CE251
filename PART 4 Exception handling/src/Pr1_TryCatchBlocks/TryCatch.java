package Pr1_TryCatchBlocks;

public class TryCatch {
    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 0;
        arr[1] = 10;
        String str = null;
        Number[] numArr = new Double[3];
        //ArithmeticException
        try{
            System.out.println(arr[1]/arr[0]);
        }catch(ArithmeticException Ae){
            arr[0]=5;
            //Ae.printStackTrace();
            System.out.println(arr[1]/arr[0]);

            //ArrayIndexOutOfBoundsException
            try{
                arr[10] = 10;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }
        //NullPointerException
        try{
            System.out.println(str.length());
        }catch (NullPointerException Npe){
            System.out.println(Npe.getMessage());
        }
        //ArrayStoreException
        try{
            numArr[0] = new Integer(10);
        }catch(ArrayStoreException Ase){
            System.out.println(Ase);
        }
        //ClassCastExceptions
        try{
            B b = (B) new A();
        }catch(ClassCastException Cce){
            System.out.println(Cce.getMessage());
        }


    }
}

class A{
    A(){
        System.out.println("From A");
    }
}
class B extends A{
    B(){
        System.out.println("From B");
    }
}
