package linkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.insert("Node1");
        names.insert("Node2");
        names.insert("Node3");
        names.insert("Node4");

        names.traverse();

        names.remove("Node2");
        System.out.println();
        names.traverse();

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
