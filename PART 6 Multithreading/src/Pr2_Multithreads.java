import java.util.Random;

class thread1 extends Thread{
    @Override
    public void run() {
        super.run();
    }
    void display(int[] arr){
        for(int i=0;i<15;i++){
            if(i%2!=0){
                System.out.print(arr[i]+"--");
            }
        }
    }
}
class thread2 extends Thread{
    @Override
    public void run() {
        super.run();
    }
    void display(int[] arr){
        for(int i=0;i<15;i++){
            if(i%2==0){
                System.out.print(arr[i]+"++");
            }
        }
    }
}
public class Pr2_Multithreads {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = rand.nextInt(1, 100);
        }
        System.out.println("Array of random elements....");
        for (int i = 0; i < 15; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t2.start();
        t2.display(arr);
        t1.start();
        t1.display(arr);
    }
}