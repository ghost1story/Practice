/* fun merge(h1: ListNode?, h2: ListNode?): ListNode? {
    if (h1 == null) {
        return h2
    }
    if (h2 == null) {
        return h1
    }
    var mergeHead: ListNode? = null
    if (h1.value > h2.value) {
        mergeHead = h2
        mergeHead.next = merge(h1, h2.next)
    } else {
        mergeHead = h1
        mergeHead.next = merge(h1.next, h2)
    }
    return mergeHead
} */

fun merge(_h1: ListNode?, _h2: ListNode?): ListNode? {
    var h1 = _h1
    var h2 = _h2
    var head = ListNode(-1)
    var cur = head
    while (h1 != null && h2 != null) {
        if (h1.value < h2.value) {
            cur.next = h1
            h1 = h1.next
        } else {
            cur.next = h2
            h2 = h2.next
        }
        cur = cur.next!!
    }
    if (h1 != null) {
        cur.next = h1
    }
    if (h2 != null) {
        cur.next = h2
    }
    return head.next
}

fun printList(_head: ListNode?) {
    var head = _head
    while (head != null) {
        println(head.value)
        head = head.next
    }
}

fun main(args: Array<String>) {
    var l = ListNode(1)
    var l2 = ListNode(3)
    var l3 = ListNode(5)
    l.next = l2
    l2.next = l3
    var n = ListNode(1)
    var n2 = ListNode(5)
    var n3 = ListNode(9)
    n.next = n2
    n2.next = n3
    printList(merge(l, n))
}

class ListNode(var value: Int, var next: ListNode? = null) {}