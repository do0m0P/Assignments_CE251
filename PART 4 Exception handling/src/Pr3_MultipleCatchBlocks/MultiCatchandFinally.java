package Pr3_MultipleCatchBlocks;

public class MultiCatchandFinally {
    public static void main(String[] args) {
        int a=0;
        int b=10;
        int[] arr = new int[10];
        try{
            System.out.println(b/a);
        }catch(ArithmeticException Ae){
            System.out.println(Ae.getMessage());
            System.out.println(arr[20]);
        }catch(ArrayIndexOutOfBoundsException Aioe){
            System.out.println(Aioe.getMessage());
        }finally {
            System.out.println("Finally block");
        }
    }
}
