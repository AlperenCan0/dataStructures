package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInJava {
    public static void main(String[] args) {

        // we process the items in a first come first served manner
        Queue<Integer> queue = new LinkedList<>();

        // add() method inserts a new item into the queue in O(1)
        queue.add(101);
        queue.add(102);
        queue.add(103);
        queue.add(104);

        // element() we can return without removing the first item
        System.out.println("First element: " + queue.element());

        System.out.println("Size: " + queue.size());

        // remove() method is a dequeue() method in O(1)
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

    }
}
