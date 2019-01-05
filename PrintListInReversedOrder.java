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
        if (listNode != null) {
            list.addAll(reverse2(listNode.next));
            list.add(listNode.value);
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(3);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(7);
        l.next = l2;
        l2.next = l3;

        System.out.println(new PrintListInReversedOrder().reverse(l));
    }
}

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }
}