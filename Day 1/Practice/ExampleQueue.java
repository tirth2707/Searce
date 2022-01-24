import java.util.*;

public class ExampleQueue {

    public static void main(String[] args) {

        Queue<Integer> temp = new LinkedList<>();

        // enque operation
        temp.offer(1);
        temp.offer(2);
        temp.offer(3);
        System.out.println("Queue: " + temp);

      
        // delete element from the front of the queue
        int removedNumber = temp.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Queue after deletion: " + temp);

    }
}