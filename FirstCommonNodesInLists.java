public class FirstCommonNodesInLists {

    ListNode getCommon(ListNode node1, ListNode node2) {
        ListNode l1 = node1;
        ListNode l2 = node2;
        while (l1 != l2) {
            l1 = l1 == null ? node2 : l1.next;
            l2 = l2 == null ? node1 : l2.next;
        }
        return l1;
    }
}

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }
}