class Sleep extends Thread{
    @Override
    public void run() {
        super.run();

        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Awake extends Thread{
    @Override
    public void run() {
        super.run();

        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Pr3_Sleep {
    public static void main(String[] args) {
        Sleep S = new Sleep();
        Awake A = new Awake();


        Thread t1 = new Thread(S);
        Thread t2 = new Thread(A);
        t1.start();
        t2.start();
    }
}
