package stack.interviewQuestions;

import java.util.Stack;

public class MaxItemAStack {
    // this is the original stack
    private Stack<Integer> mainStack;

    // this stack is just for tracking the maximum item
    private Stack<Integer> maxStack;

    public MaxItemAStack() {
        this.mainStack = new Stack<>();
        this.maxStack = new Stack<>();
    }

    public void push(int item) {
        // push the new item onto the stack
        mainStack.push(item);

        // first item is the same in both stack
        if (mainStack.size() == 1) {
            maxStack.push(item);
            return;
        }

        // if the item is the largest one so far: we insert it onto the stack
        if (item > maxStack.peek()) {
            maxStack.push(item);
        } else {
            // if not the largest one then we duplicate the largest one on the maxStack
            maxStack.push(maxStack.peek());
        }
    }

    // when removing an item we remove it from both stack
    public int pop() {
        maxStack.pop();
        return maxStack.pop();
    }

    // max item is the last item we have inserted into the maxStack
    public int getMaxItem() {
        return maxStack.peek();
    }
}
