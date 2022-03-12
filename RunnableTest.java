class Mytask2 implements Runnable{

@Override
public void run() {
        System.out.println("Child thread is running....");
        for(int i=0;i<20;i++) {
        System.out.println("child "+" " + i);
        }
        System.out.println("===========================");
        }
        }
public class RunnableTest
{
    public static void main(String[] args) {
        System.out.println("--Application  Stacrted--");
        Runnable t = new Mytask();
        Thread task = new Thread(t);
        task.start();
        System.out.println("Main thread is running....");
        for(int i=0;i<10;i++) {
            System.out.println("main "+ Thread.currentThread().getName()+ " "+i);
        }
        System.out.println("Main thread Ends here");
    }
}