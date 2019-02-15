fun reorder(n: IntArray) {
    var before = 0
    var after = n.size - 1
    var temp: Int
    while (before < after) {
        while (before < after && n[before] % 2 == 1) {
            before++
        }
        while (before < after && n[after] % 2 == 0) {
            after--
        }
        if (before < after) {
            temp = n[before]
            n[before] = n[after]
            n[after] = temp
        }
    }
}

fun printNum(n: IntArray) {
    for (i in n) {
        println(i)
    }
    /* n.forEach(::println) */
    println()
}

fun main(args: Array<String>) {
    var n = intArrayOf(2, 1, 4, 3)
    var n2 = intArrayOf(1, 2, 3, 4, 5, 6)
    var n3 = intArrayOf(2, 4, 6, 1, 3, 5, 7)
    var n4 = intArrayOf(1, 3, 5, 7, 2, 4, 6)
    var n5 = intArrayOf(1)
    var n6 = intArrayOf(2)
    reorder(n)
    printNum(n)
    reorder(n2)
    printNum(n2)    
    reorder(n3)
    printNum(n3)
    reorder(n4)
    printNum(n4)
    reorder(n5)
    printNum(n5)
    reorder(n6)
    printNum(n6)
}