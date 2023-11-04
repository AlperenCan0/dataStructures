package avlTree;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> avl = new AVLTreeImpl<>();

        avl.insert(3);
        avl.insert(1);
        avl.insert(2);

        avl.traverse();
    }
}
