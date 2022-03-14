import java.util.*;
public class QueueExample1 {
    public static void main(String[] args){
        Queue<Integer> q1 = new PriorityQueue<>();
        for(int i=1;i<=6;i++){
            q1.add(i);
        }
        System.out.println("Queue elements are   :"+q1);
        System.out.println("Removing one element from queue : "+q1.poll());
        System.out.println("Removing one element from queue : "+q1.poll());
        System.out.println("Remaining Queue elements are   :"+q1);

    }
}