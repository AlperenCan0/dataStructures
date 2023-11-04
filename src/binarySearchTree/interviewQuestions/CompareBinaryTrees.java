package binarySearchTree.interviewQuestions;

import binarySearchTree.Node;

public class CompareBinaryTrees<T extends Comparable<T>> {

    // case when one of the nodes is a null (or both of them)
    // CHECK THE TOPOLOGY !!!
    public boolean isTreeSame(Node<T> node1, Node<T> node2) {
        if ((node1 == null && node2 == null) || (node1 == null && node2 != null) || (node1 != null && node2 == null)) {
            return node1 == node2;
        }

        // CHECK THE VALUES !!!
        if (node1.getData().compareTo(node2.getData()) != 0) return false;

        // consider other nodes recursively
        return isTreeSame(node1.getLeftChild(), node2.getLeftChild()) &&
                isTreeSame(node1.getRightChild(), node2.getRightChild());
    }
}
