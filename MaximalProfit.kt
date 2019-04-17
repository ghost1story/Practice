fun getProfit(n: IntArray): Int {
    /* if (n.size == 0) return 0
    var min = Int.MAX_VALUE
    var maxProfit = Int.MIN_VALUE
    for (i in n) {
        min = minOf(i, min)
        maxProfit = maxOf(maxProfit, i - min)
    }
    return if (maxProfit > 0) maxProfit else 0 */

    var maxCur = 0
    var maxFar = 0
    for (i in 1 until n.size) {
        maxCur += n[i] - n[i - 1]
        maxCur = maxOf(0, maxCur)
        maxFar = maxOf(maxFar, maxCur)
    }
    return maxFar
}

fun isRight(input: Int, exp: Int) {
    println("input is $input")
    println(input == exp)
}

fun main(args: Array<String>) {
    val n = intArrayOf(1, 2, 3)
    val n2 = intArrayOf(2, 1, 4)
    val n3 = intArrayOf(4, 2, 1)
    val n4 = intArrayOf(2, -1, 4)
    val n5 = intArrayOf(-2, -1, 4)
    val n6 = intArrayOf(-2, -1, -4)
    val n7 = intArrayOf(4, -1, -2)
    val n8 = intArrayOf(-1, -2, -4)

    // isRight(getProfit(n), 2)
    // isRight(getProfit(n2), 3)
    isRight(getProfit(n3), 0)
    // isRight(getProfit(n4), 5)
    // isRight(getProfit(n5), 6)
    isRight(getProfit(n6), 1)
    isRight(getProfit(n7), 0)
    isRight(getProfit(n8), 0)
}