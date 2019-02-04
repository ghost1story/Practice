/* fun reverse(head: ListNode?): ListNode? {
    if (head == null || head.next == null) {
        return head
    }
    var next = head.next
    head.next = null
    var newHead = reverse(next)
    next?.next = head
    return newHead
} */

fun reverse(head: ListNode?): ListNode? {
    if (head == null) {
        return null
    }
    var newHead: ListNode? = null
    var cur = head
    var pre: ListNode? = null
    while (cur != null) {
        var next = cur.next
        if (next == null) {
            newHead = cur
        }
        cur.next = pre
        pre = cur
        cur = next
    }
    return newHead
}

fun printList(_head: ListNode?) {
    var head = _head
    while (head != null) {
        println(head.value)
        head = head.next
    }
}

fun main(args: Array<String>) {
    var l = ListNode(3)
    var l2 = ListNode(4)
    var l3 = ListNode(5)
    l.next = l2
    l2.next = l3

    var l4 = ListNode(9)

    printList(reverse(l))
    printList(reverse(l4))
    printList(reverse(null))
}

class ListNode(var value: Int, var next: ListNode? = null) {
}