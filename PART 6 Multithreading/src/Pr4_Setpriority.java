class FIRST extends Thread{
    @Override
    public void run() {
        setPriority(3);
        System.out.println("From FIRST...");
    }
}
class SECOND extends Thread{
    @Override
    public void run() {
        setPriority(5);
        System.out.println("From SECOND...");
    }
}
class THIRD extends Thread{
    @Override
    public void run() {
        setPriority(7);
        System.out.println("From THIRD....");
    }
}

public class Pr4_Setpriority {
    public static void main(String[] args) throws InterruptedException {
        FIRST F = new FIRST();
        SECOND S = new SECOND();
        THIRD T = new THIRD();

        Thread t1 = new Thread(F);
        Thread t2 = new Thread(S);
        Thread t3 = new Thread(T);

        System.out.println("FIRST priority: "+F.getPriority());
        System.out.println("SECOND priority: "+ S.getPriority());
        System.out.println("THIRD priority: " + T.getPriority());

        t1.start();
        t2.start();
        t3.start();
    }
}
