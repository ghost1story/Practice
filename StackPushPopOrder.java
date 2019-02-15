import java.util.Stack;

public class StackPushPopOrder {

    boolean isMatch(int[] pushOrder, int[] popOrder) {
        if (pushOrder == null || popOrder == null || pushOrder.length != popOrder.length) {
            return false;
        }
        int len = popOrder.length;
        Stack<Integer> stack = new Stack<>();
        int push = 0;
        int pop = 0;
        for (; push < len; push++) {
            /* System.out.println("push: " + push);
            System.out.println("pop: " + pop); */
            stack.push(pushOrder[push]);
            while (pop < len && !stack.isEmpty() && stack.peek() == popOrder[pop]) {
                stack.pop();
                pop++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackPushPopOrder s  = new StackPushPopOrder();

        int[] push = {1, 2, 3, 4, 5};
        int[] pop = {4, 5, 3, 2, 1};
        System.out.println(s.isMatch(push, pop));

        int[] push2 = {1, 2, 3, 4, 5};
        int[] pop2 = {3, 5, 4, 2, 1};
        System.out.println(s.isMatch(push2, pop2));

        int[] push3 = {1, 2, 3, 4, 5};
        int[] pop3 = {4, 3, 5, 1, 2};
        System.out.println(s.isMatch(push3, pop3));

        int[] push4 = {1, 2, 3, 4, 5};
        int[] pop4 = {3, 5, 4, 1, 2};
        System.out.println(s.isMatch(push4, pop4));

        int[] push5 = {1};
        int[] pop5 = {2};
        System.out.println(s.isMatch(push5, pop5));

        int[] push6 = {1};
        int[] pop6 = {1};
        System.out.println(s.isMatch(push6, pop6));

        System.out.println(s.isMatch(null, null));
    }
}