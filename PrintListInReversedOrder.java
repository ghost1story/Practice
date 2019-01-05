import java.util.ArrayList;
import java.util.Stack;

public class PrintListInReversedOrder {

    private ArrayList<Integer> reverse(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.value);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.empty()) {
            list.add(stack.pop());
        }
        return list;
    }

    private ArrayList<Integer> reverse2(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null) {
            list.addAll(reverse2(listNode.next));
            list.add(listNode.value);
        }
        return list;
    }
}