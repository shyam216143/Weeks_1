class Mytask extends Thread{

    @Override
    public void run() {
        System.out.println("Child thread is running....");
        for(int i=0;i<10;i++) {
            System.out.println("child "+ currentThread().getName()+ " " + i);
        }
    }
}
public class Test
{
    public static void main(String[] args) {
        Mytask t = new Mytask();
        t.start();

        System.out.println("Main thread is running....");
        for(int i=0;i<100;i++) {
            System.out.println("main "+ Thread.currentThread().getName()+ " "+i);
        }
    }
}