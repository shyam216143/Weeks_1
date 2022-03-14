import java.util.*;
public class HashSetExample {
    public static void main(String[] args){
        HashSet <Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(4);
        hs.add(5);
        hs.add(3);
        hs.add(7);
        hs.add(6);
        hs.add(2);
        hs.add(9);
        hs.add(0);
        System.out.println("Group of integers using HashSet :"+hs);

    }
}
