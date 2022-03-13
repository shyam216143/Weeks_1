class Thread1 extends Thread{
    @Override
    public void run(){
        System.out.println("Hello All");
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
        System.out.println("Hello All");
    }
}
class Thread3 extends Thread{
    @Override
    public void run(){
        System.out.println("Hello All");
    }
}
class Thread4 extends Thread{
    @Override
    public void run(){
        System.out.println("Hello All");
    }
}
class Thread5 extends Thread{
    @Override
    public void run(){
        System.out.println("Hello All");
    }
}
public class MultipleThreadsUsingThreads {
    public static void main(String[] args){
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();
        Thread5 t5 = new Thread5();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
