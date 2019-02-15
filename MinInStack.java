import java.util.Stack;

public class MinInStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    void push(int n) {
        stack.push(n);
        minStack.push(minStack.empty() ? n : Math.min(minStack.peek(), n));
    }

    int pop() {
        minStack.pop();
        return stack.pop();
    }

    int min() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinInStack m = new MinInStack();
        m.push(3);
        m.push(4);
        m.push(2);
        m.push(3);
        System.out.println(m.min());
        m.pop();
        System.out.println(m.min());
        m.pop();
        System.out.println(m.min());
        m.pop();
        m.push(0);
        System.out.println(m.min());
        m.pop();
        System.out.println(m.min());
    }
}