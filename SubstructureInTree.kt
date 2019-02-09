fun isSubTree(h1: BinaryTree?, h2: BinaryTree?): Boolean {
    if (h1 == null || h2 == null) {
        return false
    }
    return isSubTreeRoot(h1, h2) || isSubTree(h1.left, h2) || isSubTree(h1.right, h2)
}

fun isSubTreeRoot(h1: BinaryTree?, h2: BinaryTree?): Boolean {
    if (h2 == null) {
        return true
    }
    if (h1 == null) {
        return false
    }
    if (h1.value != h2.value) {
        return false
    }
    return isSubTreeRoot(h1.left, h2.left) && isSubTreeRoot(h1.right, h2.right)
}

class BinaryTree(var value: Int, var left: BinaryTree? = null, var right: BinaryTree? = null) {
    
    fun ConnectTreeNodes(root: BinaryTree, left: BinaryTree?, right: BinaryTree?) {
        root.left = left
        root.right = right
    }
}

fun main(args: Array<String>) {
    /* var p1 = BinaryTree(8)
    var p2 = BinaryTree(8)
    var p3 = BinaryTree(7)
    var p4 = BinaryTree(9)
    var p5 = BinaryTree(2)
    var p6 = BinaryTree(4)
    var p7 = BinaryTree(7)
    p1.ConnectTreeNodes(p1, p2, p3);
    p1.ConnectTreeNodes(p2, p4, p5);
    p1.ConnectTreeNodes(p5, p6, p7); */

    var p1 = BinaryTree(8)
    var p2 = BinaryTree(8)
    var p3 = BinaryTree(7)
    var p4 = BinaryTree(9)
    var p5 = BinaryTree(3)
    var p6 = BinaryTree(4)
    var p7 = BinaryTree(7)
    p1.ConnectTreeNodes(p1, p2, p3);
    p1.ConnectTreeNodes(p2, p4, p5);
    p1.ConnectTreeNodes(p5, p6, p7);

    var n1 = BinaryTree(8)
    var n2 = BinaryTree(9)
    var n3 = BinaryTree(2)
    n1.ConnectTreeNodes(n1, n2, n3)

    println(isSubTree(p1, n1))
}