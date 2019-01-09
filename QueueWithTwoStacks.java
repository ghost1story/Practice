import java.util.Stack;

public class QueueWithTwoStacks {

    private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();

    private void appendTail(int n) {
        in.push(n);
    }

    private int deleteHead() {
        if (!out.empty()) {
            return out.pop();
        }
        while (!in.empty()) {
            out.push(in.pop());
        }
        return out.pop();
    }

    public static void main(String[] args) {
        QueueWithTwoStacks q = new QueueWithTwoStacks();
        q.appendTail(5);
        q.appendTail(7);
        q.appendTail(6);
        System.out.println(q.deleteHead());
        System.out.println(q.deleteHead());
        q.appendTail(10);
        System.out.println(q.deleteHead());
        q.appendTail(9);
        System.out.println(q.deleteHead());
        System.out.println(q.deleteHead());
    }
}