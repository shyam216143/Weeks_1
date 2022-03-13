import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask1 implements Runnable{
    private int number;
    public MyTask1(int s){
        this.number=s;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"= "+number);
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
            Runnable worker = new MyTask1(  i);
            executor.execute(worker);
        }
        executor.shutdown();

        System.out.println("Finished all the numbers");
    }
}
