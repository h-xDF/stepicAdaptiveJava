package QueuesDifferentOperations1;

/**
 * There is a queue of 4 elements. Put in it one more element - the number 5, and then get 2 items out of the queue.
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));

        queue.add(5);
        queue.removeFirst();
        queue.removeFirst();

        System.out.println(queue);

    }
}
