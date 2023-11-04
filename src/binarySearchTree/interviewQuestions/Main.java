package binarySearchTree.interviewQuestions;

import binarySearchTree.BinarySearchTreeImpl;
import binarySearchTree.Tree;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> bst1 = new BinarySearchTreeImpl<>();
        bst1.insert(10);
        bst1.insert(5);
        bst1.insert(20);
        bst1.insert(1);
        bst1.insert(17);
        bst1.insert(22);
        bst1.insert(6);

        Tree<Integer> bst2 = new BinarySearchTreeImpl<>();
        bst2.insert(10);
        bst2.insert(6);
        bst2.insert(20);
        bst2.insert(1);
        bst2.insert(17);
        bst2.insert(22);
        bst2.insert(5);

        CompareBinaryTrees<Integer> handler = new CompareBinaryTrees<>();
        System.out.println(handler.isTreeSame(bst1.getRoot(), bst2.getRoot()));
    }
}
