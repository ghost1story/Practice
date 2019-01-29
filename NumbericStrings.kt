class Number {
    var i = 0

    fun scanUnsignedInteger(c: CharArray): Boolean {
        val before = i
        while (i < c.size && c[i] >= '0' && c[i] <= '9') {
            i++
            // println("i is $i")
        }
        return i > before
    }

    fun scanInteger(c: CharArray): Boolean {
        if (i < c.size && (c[i] == '+' || c[i] == '-')) {
            i++
        }
        return scanUnsignedInteger(c)
    }

    fun isNumber(c: CharArray): Boolean {
        var isNumber = scanInteger(c)
        if (i < c.size && c[i] == '.') {
            i++
            isNumber = scanUnsignedInteger(c) || isNumber
        }
        if (i < c.size && (c[i] == 'e' || c[i] == 'E')) {
            i++
            isNumber = scanInteger(c) && isNumber
        }
        return isNumber && i == c.size
    }
}

private fun test(c: CharArray, expected: Boolean) {
    val n = Number()
    if (n.isNumber(c) == expected) {
        println("passed")
    } else {
        println("failed")
    }
}

fun main() {
    // test("123.45e+6".toCharArray(), true)
    // test("100".toCharArray(), true)
    // test("123.45e+6".toCharArray(), true)
    // test("+500".toCharArray(), true)
    // test("5e2".toCharArray(), true)
    // test("3.1416".toCharArray(), true)
    // test("600.".toCharArray(), true)
    // test("-.123".toCharArray(), true)
    // test("-1E-16".toCharArray(), true)
    // test("1.79769313486232E+308".toCharArray(), true)

    // test("12e".toCharArray(), false);
    test("1a3.14".toCharArray(), false);
    test("1+23".toCharArray(), false);
    test("1.2.3".toCharArray(), false);
    // test("+-5".toCharArray(), false);
    test("12e+5.4".toCharArray(), false);
    // test(".".toCharArray(), false);
    // test(".e1".toCharArray(), false);
    // test("e1".toCharArray(), false);
    // test("+.".toCharArray(), false);
    // test("".toCharArray(), false);
}