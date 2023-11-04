package queue.queueImplWithLinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("size: " + queue.size());
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("size: " + queue.size());
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("dequeue: " + queue.dequeue());

    }
}
