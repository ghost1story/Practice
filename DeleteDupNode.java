public class DeleteDupNode {

    private ListNode deleteNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        if (head.val == next.val) {
            do {
                next = next.next;
            } while (head.val == next.val);
        } else {
            head.next = deleteNode(head.next);
        }
    }
}