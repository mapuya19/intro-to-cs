import java.util.ArrayList;

public class Stack extends ArrayList<Integer> {
    public static void main(String[] args) {
        Stack s1 = new Stack(5);
        s1.push(1);
        s1.push(2);
        // s1.peek();
        // s1.pop();
        System.out.println("Stack1: " + s1);

        Stack s2 = new Stack(5);
        s2.push(1);
        s2.push(2);
        // s1.peek();
        // s2.pop();
        System.out.println("Stack2: " + s2);
        System.out.println();

        System.out.println("Stack1 = Stack2: " + s1.equals(s2));
    }

    private ArrayList<Integer> stack;
    private int size;

    public Stack(int size) {
        this.size = size;
        this.stack = new ArrayList<Integer>(size);
    }

    public int size() {
        return this.size;
    }

    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        else {
            int peek = stack.get(stack.size() - 1);
            return peek;
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        else {
            int popped = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return popped;
        }
    }

    public void push(int x) {
        stack.add(x);
    }

    @Override
    public String toString() {
        StringBuilder stackString = new StringBuilder();

        for (int ele : stack) {
            stackString.append(ele);
            stackString.append(", ");
        }

        stackString.deleteCharAt(stackString.length() - 2);

        return stackString.toString();
    }

    public boolean equals(Stack s) {
        return this.stack.equals(s.stack);
    }
}
