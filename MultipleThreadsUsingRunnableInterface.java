class MyThread1 extends Thread implements Runnable{
    @Override
    public void run(){
        System.out.println("Hello India");
    }
}
class MyThread2 extends Thread implements Runnable{
    @Override
    public void run(){
        System.out.println("Hello India");
    }
}
class MyThread3 extends Thread implements Runnable{
    @Override
    public void run(){
        System.out.println("Hello India");
    }
}
class MyThread4 extends Thread implements Runnable{
    @Override
    public void run(){
        System.out.println("Hello India");
    }
}
class MyThread5 extends Thread implements Runnable{
    @Override
    public void run(){
        System.out.println("Hello India");
    }
}
public class MultipleThreadsUsingRunnableInterface {
    public static void main(String[] args){
        Runnable t1 = new MyThread1();
        Thread r1 = new Thread(t1);
        Runnable t2 = new MyThread2();
        Thread r2 = new Thread(t2);
        Runnable t3 = new MyThread3();
        Thread r3 = new Thread(t3);
        Runnable t4 = new MyThread4();
        Thread r4 = new Thread(t4);
        Runnable t5 = new MyThread5();
        Thread r5 = new Thread(t5);
        r1.start();
        r2.start();
        r3.start();
        r4.start();
        r5.start();


    }
}
