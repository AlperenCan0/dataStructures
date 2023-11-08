package redBlackTree;

public class Main {

    public static void main(String[] args) {

        Tree<Integer> rbt = new RedBlackTreeImpl<>();

        rbt.insert(5);
        rbt.insert(3);
        rbt.insert(6);
        rbt.insert(8);
        rbt.insert(19);
        rbt.insert(79);
        rbt.insert(16);
        rbt.insert(23);
        rbt.insert(12);


        rbt.traverse();
    }
}
