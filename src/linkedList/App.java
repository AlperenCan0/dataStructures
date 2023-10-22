package linkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> nodes = new LinkedList<>();

        nodes.insert("Node1");
        nodes.insert("Node2");
        nodes.insert("Node3");
        nodes.insert("Node4");

        nodes.traverse();

        nodes.remove("Node2");
        System.out.println();
        nodes.traverse();

        LinkedList<Person> people = new LinkedList<>();
        Person adam = new Person(23, "Adam");
        Person daniel = new Person(34, "Daniel");
        Person micheal = new Person(56, "Micheal");

        people.insert(adam);
        people.insert(daniel);
        people.insert(micheal);

        System.out.println();
        people.traverse();

        people.remove(micheal);
        System.out.println();
        people.traverse();


    }
}
