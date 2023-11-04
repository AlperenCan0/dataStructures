package stack.stackImplWithArray;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        integerStack.push(6);
        integerStack.push(7);

        while(!integerStack.isEmpty()) {
            System.out.println(integerStack.pop());
        }
    }
}
