public class DeleteNodeInList {

    private void deleteNode(ListNode head, ListNode deleted) {
        // 被删除的不在当前链表中
        if (!isExist(head, deleted)) {
            return;
        }
        // 被删除的是头部
        if () {}
        // 被删除的尾部
        if () {}
        // 被删除的在中间
        ListNode start = head;
        ListNode mid = start.next;
        ListNode end = mid.next;
        while (mid != deleted) {
            start = mid;
            mid = end;
            end = end.next;
        }
        start.next = end;
        mid.next = null;
    }

    private boolean isExist(ListNode head, ListNode aim) {
        while (head.val != aim.val && head.next != null) {
            head = head.next;
        }
        return head.next == null ? false : true;
    }
}