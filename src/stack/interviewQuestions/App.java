package stack.interviewQuestions;

public class App {
    public static void main(String[] args) {
        MaxItemAStack maxItemAStack = new MaxItemAStack();

        maxItemAStack.push(5);
        maxItemAStack.push(2);
        maxItemAStack.push(7);
        maxItemAStack.push(8);
        maxItemAStack.push(11);
        maxItemAStack.push(3);
        maxItemAStack.push(0);

        System.out.println(maxItemAStack.getMaxItem());

        System.out.println();

        StackWithQueue stackWithQueue = new StackWithQueue();

        stackWithQueue.enqueue(10);
        stackWithQueue.enqueue(5);
        stackWithQueue.enqueue(20);

        System.out.println(stackWithQueue.dequeue());

        stackWithQueue.enqueue(100);

        System.out.println(stackWithQueue.dequeue());
        System.out.println(stackWithQueue.dequeue());
        System.out.println(stackWithQueue.dequeue());
    }
}
