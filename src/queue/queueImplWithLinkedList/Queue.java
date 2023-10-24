package queue.queueImplWithLinkedList;

// implement the Queue ADT with linked-list under the hood
public class Queue<T extends Comparable<T>> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int count;

    // O(1)
    // we always manipulate the lastNode
    public void enqueue(T data) {
        this.count++;

        Node<T> oldLastNode = this.lastNode;
        this.lastNode = new Node<>(data);

        if (isEmpty()) {
            this.firstNode = this.lastNode;
        } else {
            oldLastNode.setNextNode(this.lastNode);
        }
    }

    // O(1)
    // we always manipulate the firstNode
    public T dequeue() {

        if(isEmpty()) return null;

        this.count--;

        T dataToRemove = this.firstNode.getData();
        this.firstNode = this.firstNode.getNextNode();

        if (isEmpty()) {
            this.lastNode = null;
        }

        return dataToRemove;
    }
    public int size() {
        return count;
    }
    public boolean isEmpty() {
        return this.firstNode == null;
    }
}
