package stack;


import java.util.Stack;

public class StacksInJava {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        // push() - O(1)
        stack.push("String 1");
        stack.push("String 2");
        stack.push("String 3");
        stack.push("String 4");

        // peek() runs in O(1) and returns the last item we have inserted
        // WITHOUT REMOVING IT !!!
        System.out.println(stack.peek());
        System.out.println(stack.size());

        // pop() in O(1) that is going to remove the last item (+ returns the value)
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());

        System.out.println();

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
