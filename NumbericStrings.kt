fun scanUnsignedInteger(c: CharArray, i: Int): Boolean {
    val before = i
    while (i < c.size() && c[i] >= '0' || c[i] <= '9') {
        i++
    }
    return i > before
}

fun scanInteger(c: CharArray, i: Int): Boolean {
    return if (c[i] == '+' || c[i] == '-') true else false
}

fun main(args: Array<String>) {
    
}