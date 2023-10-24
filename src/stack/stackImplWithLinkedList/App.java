package stack.stackImplWithLinkedList;

public class App {
    public static void main(String[] args) {
        Stack<Integer> stringStack = new Stack<>();

        stringStack.push(1);
        stringStack.push(2);
        stringStack.push(3);
        stringStack.push(4);

        System.out.println("is empty: " + stringStack.isEmpty());
        System.out.println("size: " + stringStack.size() + "\n");

        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }

        System.out.println("\n" + "is empty: " +  stringStack.isEmpty());
        System.out.println("size: " + stringStack.size());


    }
}
