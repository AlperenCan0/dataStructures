package binarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTreeImpl<Integer> bst = new BinarySearchTreeImpl<>();

        bst.insert(12);
        bst.insert(4);
        bst.insert(20);
        bst.insert(1);
        bst.insert(8);
        bst.insert(16);
        bst.insert(27);

        bst.remove(16);
        bst.remove(20);
        bst.traversal();

        System.out.println();

        BinarySearchTreeImpl<Person> bstPerson = new BinarySearchTreeImpl<>();

        bstPerson.insert(new Person(12, "name1"));
        bstPerson.insert(new Person(5, "name2"));
        bstPerson.insert(new Person(78, "name3"));
        bstPerson.insert(new Person(56, "name4"));
        bstPerson.insert(new Person(34, "name5"));
        bstPerson.insert(new Person(41, "name6"));

        bstPerson.traversal();


    }
}
