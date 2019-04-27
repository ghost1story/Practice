import kotlin.math.*

fun toInt(s: String): Int {
    var str = s.trim()
    if (str.length == 0) return 0
    var res = 0
    var negative = false
    var index = 0
    val maxValueDivideTen = Int.MAX_VALUE / 10
    val maxValueModTen = Int.MAX_VALUE % 10
    if (str[index] == '-' || str[index] == '+') {
        if (str[index] == '-') negative = true
        index++
    }
    for (i in index until str.length) {
        if (str[i] < '0' || str[i] > '9') break
        var curChar = str[i] - '0'
        if (maxValueDivideTen < res || maxValueDivideTen == res && maxValueModTen < curChar) {
            return if (negative) Int.MIN_VALUE else Int.MAX_VALUE
        }
        res = curChar + res * 10
    }
    return if (negative) -res else res
}

fun strToInt(s: String) = println(toInt(s))

fun main() {
    // strToInt("123")
    // strToInt("+123")
    // strToInt("-0")
    // strToInt("-231")
    // strToInt("-")
    // strToInt("+")
    // strToInt("23ba")
    // strToInt("bb34")
    // strToInt("+2147483647")
    // strToInt("-2147483647")
    // strToInt("+2147483648")
    // strToInt("-2147483648")
    // strToInt("+2147483649")
    // strToInt("-2147483649")
    // var i: Int = Int.MAX_VALUE + 1
    // var j: Int = Int.MIN_VALUE - 1
    // println("i is $i, j is $j")
    strToInt("  3-2")
    // strToInt("  -42")
}