package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeInJava {
    public static void main(String[] args) {
        // double ended queue (DEQUE)
        // huge one dimensional arrays - O(1)

        // FIFO
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(1);
        deque.offer(10);
        deque.offer(100);
        deque.offer(1000);
        deque.offer(10000);

        while (!deque.isEmpty()) {
            System.out.println(deque.pop());
        }

        System.out.println("\n" + deque.poll() + "\n");


        // LIFO
        deque.push(1);
        deque.push(10);
        deque.push(100);
        deque.push(1000);
        deque.push(10000);

        while (!deque.isEmpty()) {
            System.out.println(deque.pop());
        }
    }
}
