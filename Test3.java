class Mytask extends Thread{

    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("Hello");
        }
    }
}
public class Test3
{
    public static void main(String[] args) {
        Mytask t = new Mytask();
        t.start();
    }
}