public class DeleteNodeInList {

    private ListNode deleteNode(ListNode head, ListNode deleted) {
        if (head == null || deleted == null) {
            return null;
        }
        if (deleted.next != null) {
            ListNode node = deleted.next;
            deleted.val = node.val;
            deleted.next = node.next;
        } else if (head.val == deleted.val) {
            deleted = null;
            head = null;
        } else {
            while (head.next != deleted) {
                head = head.next;
            }
            head.next = null;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(3);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(5);
        l.next = l2;
        l2.next = l3;

        DeleteNodeInList d = new DeleteNodeInList();
        d.deleteNode(l, l);
        while (l != null) {
            System.out.println(l.val);
            l = l.next;
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