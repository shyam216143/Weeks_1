import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask1 implements Runnable{
    private int command;
    public MyTask1(int s){
        this.command=s;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"= "+command);
        respondToMessage();
    }

    private void respondToMessage() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ExecutorFramework {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            Runnable p = new MyTask1(  i);
            executor.execute(p);
        }
        executor.shutdown();
        System.out.println("Finished all  the numbers");
    }
}
