fun isContinous(nums: IntArray): Boolean {
    nums.sort()
    var index = 0
    while (nums[index] == 0) index++
    var zeroNums = index
    for (i in index until nums.size - 1) {
        if (nums[i] == nums[i + 1]) return false
        zeroNums -= nums[i + 1] - nums[i] - 1
    }
    return zeroNums >= 0
}

fun isRight(n: IntArray, res: Boolean) {
    println(isContinous(n) == res)
}

fun main(args: Array<String>) {
    val n2 = intArrayOf(3, 1, 2, 4, 5)
    val n3 = intArrayOf(3, 1, 9, 4, 5)
    val n4 = intArrayOf(3, 3, 1, 4, 2)
    val n5 = intArrayOf(3, 3, 1, 4, 5)
    val n = intArrayOf(3, 5, 0, 6, 7, 8)
    val n7 = intArrayOf(0, 3, 5, 0, 6, 7, 8)
    val n8 = intArrayOf(0, 3, 5, 0, 0, 7, 9)
    val n9 = intArrayOf(0, 3, 5, 0, 0, 7, 10)
    isRight(n2, true)
    isRight(n3, false)
    isRight(n4, false)
    isRight(n5, false)
    isRight(n, true)
    isRight(n7, true)
    isRight(n8, true)
    isRight(n9, false)
}