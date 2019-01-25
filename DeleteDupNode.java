public class DeleteDupNode {

    private ListNode deleteNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        if (head.val == next.val) {
            do {
                next = next.next;
            } while (next != null && head.val == next.val);
            return deleteNode(next);
        } else {
            head.next = deleteNode(head.next);
            return head;
        }
    }

    public static void main(String[] args) {
        // ListNode l = new ListNode(5);
        ListNode l2 = new ListNode(7);
        ListNode l3 = new ListNode(7);
        ListNode l4 = new ListNode(7);
        // l.next = l2;
        l2.next = l3;
        l3.next = l4;

        DeleteDupNode d = new DeleteDupNode();
        ListNode n = d.deleteNode(l2);
        while (n != null) {
            System.out.println(n.val);
            n = n.next;
        }
    }
}

class ListNode {

    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}