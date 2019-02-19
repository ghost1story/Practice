public class CopyComplexList {

    ComplexNode copy(ComplexNode head) {
        if (head == null) {
            return null;
        }
        ComplexNode cur = head;
        while (cur != null) {
            ComplexNode newOne = new ComplexNode(cur.value);
            newOne.next = cur.next;
            cur.next = newOne;
            cur = newOne.next;
        }
        cur = head;
        while (cur != null) {
            ComplexNode nextOne = cur.next;
            nextOne.random = cur.random.next;
            cur = nextOne.next;
        }
        cur = head;
        ComplexNode newHead = cur.next;
        while (cur.next != null) {
            ComplexNode next = cur.next;
            cur.next = next.next;
            cur = next;
        }
        return newHead;
    }
}

class ComplexNode {

    int value;
    ComplexNode next;
    ComplexNode random;

    public ComplexNode(int value) {
        this.value = value;
    }
}