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
            if (cur.random != null) {
                nextOne.random = cur.random.next;
            }
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

    static void printNode(ComplexNode node) {
        while (node != null) {
            System.out.println("node is " + node.value);
            if (node.random != null) {
                System.out.println("random is " + node.random.value);
            }
            node = node.next;
        }
    }

    public static void main(String[] args) {
        CopyComplexList l = new CopyComplexList();

        ComplexNode c = new ComplexNode(1);
        ComplexNode c2 = new ComplexNode(2);
        ComplexNode c3 = new ComplexNode(3);
        ComplexNode c4 = new ComplexNode(4);
        ComplexNode c5 = new ComplexNode(5);
        c.next = c2;
        c.random = c3;
        c2.next = c3;
        c2.random = c5;
        c3.next = c4;
        c4.next = c5;
        printNode(l.copy(c));

        ComplexNode a = new ComplexNode(1);
        ComplexNode a2 = new ComplexNode(2);
        ComplexNode a3 = new ComplexNode(3);
        ComplexNode a4 = new ComplexNode(4);
        ComplexNode a5 = new ComplexNode(5);
        a.next = a2;
        a2.next = a3;
        a2.random = a5;
        a3.next = a4;
        a3.random = a3;
        a4.next = a5;
        a4.random = a2;
        printNode(l.copy(a));

        ComplexNode b = new ComplexNode(1);
        ComplexNode b2 = new ComplexNode(2);
        ComplexNode b3 = new ComplexNode(3);
        ComplexNode b4 = new ComplexNode(4);
        ComplexNode b5 = new ComplexNode(5);
        b.next = b2;
        b2.next = b3;
        b2.random = b4;
        b3.next = b4;
        b4.next = b5;
        b4.random = b2;
        printNode(l.copy(b));

        ComplexNode d = new ComplexNode(5);
        printNode(l.copy(d));
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