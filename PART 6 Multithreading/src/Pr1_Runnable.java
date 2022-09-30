
class A extends Thread{
    @Override
    public void run() {
        System.out.println("Hello World");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }
}
class B extends A implements Runnable{

    @Override
    public void run() {
        super.run();
        System.out.println("From B");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }
}
public class Pr1_Runnable {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        B b = new B();
        Thread t = new Thread(b);
        t.start();
    }
}

