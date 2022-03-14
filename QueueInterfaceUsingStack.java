import java.util.*;
public class QueueInterfaceUsingStack {
   Stack stack1 = new Stack<>();
   Stack stack2 = new Stack<>();
    Stack stack3 = new Stack<>();
    public void enqueue(int element) {
        stack1.push(element);
        System.out.println(element + " inserted");
    }
    public void dequeue() {
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        System.out.println(stack2.pop() + " removed");
        System.out.println("Remaining elements are"+stack2);
    }
    public static void main(String[] args) {
        QueueInterfaceUsingStack test = new QueueInterfaceUsingStack();
        for(int i=1;i<=6;i++) {
            test.enqueue(i);
        }
        test.dequeue();
        test.dequeue();

    }


}