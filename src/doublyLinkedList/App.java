package doublyLinkedList;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        DoublyLinkedList<String> nodes = new DoublyLinkedList<>();

        nodes.insert("Node1");
        nodes.insert("Node2");
        nodes.insert("Node3");
        nodes.insert("Node4");

        nodes.traverseBackward();

    }
}
