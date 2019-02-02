class ListNode(var value: Int, var next: ListNode? = null) {}

fun getMeeting(head: ListNode?): ListNode? {
    if (head == null) {
        return null
    }
    var pre = head.next
    if (pre == null) {
        return null
    }
    var after = pre.next
    while (pre != null && after != null) {
        if (pre == after) {
            return after
        }
        pre = pre.next
        after = after.next
        if (after?.next != null) {
            after = after.next
        }
    }
    return null
}

fun get(head: ListNode?): ListNode? {
    var meet = getMeeting(head)
    if (meet == null) {
        return null
    }
    var loopNum = 1
    var temp = meet.next
    while (temp != meet) {
        loopNum++
        temp = temp?.next
    }
    var fast = meet
    var low = head
    for (i in 1..loopNum) {
        fast = fast?.next
    }
    while (fast != low) {
        fast = fast?.next
        low = low?.next
    }
    return fast
}

fun main(args: Array<String>) {
    var l = ListNode(1)
    var l2 = ListNode(2)
    var l3 = ListNode(3)
    l.next = l2
    l2.next = l3
    l3.next = l2
    println(get(l)?.value)

    var n = ListNode(5)
    var n2 = ListNode(6)
    var n3 = ListNode(9)
    var n4 = ListNode(3)
    var n5 = ListNode(1)
    n.next = n2
    n2.next = n3
    n3.next = n4
    n4.next =n5
    n5.next = n
    println(get(n)?.value)

    n5.next = n5
    println(get(n)?.value)

    var l4 = ListNode(5)
    var l5 = ListNode(9)
    var l6 = ListNode(11)
    l4.next = l5
    l5.next = l6
    println(get(l4)?.value)
    println(get(null)?.value)

    var l7 = ListNode(1)
    println(get(l7)?.value)
}