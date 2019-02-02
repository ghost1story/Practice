fun getEnd(head: ListNode?, k: Int): Int? {
    if (head == null || k <= 0) {
        return null
    }
    var front = head
    var before = head
    for (i in 0 until k - 1) {
        /* if (front?.next != null) {
            front = front.next
        } else {
            return null
        } */
        front = front?.next ?: return null
    }
    while (front?.next != null) {
        front = front.next
        before = before?.next
    }
    // println("head is " + head?.value)
    return before?.value
}

fun main(args: Array<String>) {
    var l = ListNode(5)
    var l2 = ListNode(7)
    var l3 = ListNode(9)
    l.next = l2
    l2.next = l3

    println(getEnd(l, 1))
    println(getEnd(l, 2))
    println(getEnd(l, 3))
    println(getEnd(l, 7))
    println(getEnd(null, 7))
    println(getEnd(null, 0))
}

class ListNode(var value: Int, var next: ListNode? = null) {}