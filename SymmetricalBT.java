public class SymmetricalBT {

    boolean isSymmetrical(BinaryTree root) {
        if (root == null) {
            return true;
        }
        return isSymmetrical(root.left, root.right);
    }

    boolean isSymmetrical(BinaryTree left, BinaryTree right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.value != right.value) {
            return false;
        }
        return isSymmetrical(left.left, right.right) && isSymmetrical(left.right, right.left);
    }

    static void connectBT(BinaryTree root, BinaryTree left, BinaryTree right) {
        root.left = left;
        root.right = right;
    }

    public static void main(String[] args) {
        BinaryTree b = new BinaryTree(2);
        BinaryTree b2 = new BinaryTree(4);
        BinaryTree b3 = new BinaryTree(6);
        BinaryTree b4 = new BinaryTree(5);
        BinaryTree b5 = new BinaryTree(8);
        BinaryTree b6 = new BinaryTree(11);
        BinaryTree b7 = new BinaryTree(2);
        connectBT(b, b2, b3);
        connectBT(b2, b4, b5);
        connectBT(b3, b6, b7);

        BinaryTree a = new BinaryTree(1);
        BinaryTree a2 = new BinaryTree(2);
        BinaryTree a3 = new BinaryTree(3);
        BinaryTree a4 = new BinaryTree(4);
        connectBT(a, a2, null);
        connectBT(a2, a3, null);
        connectBT(a3, a4, null);

        BinaryTree c = new BinaryTree(5);
        BinaryTree c2 = new BinaryTree(9);
        BinaryTree c3 = new BinaryTree(2);
        BinaryTree c4 = new BinaryTree(1);
        connectBT(c, c2, null);
        connectBT(c2, c3, null);
        connectBT(c3, c4, null);

        BinaryTree d = new BinaryTree(99);
        
        SymmetricalBT s = new SymmetricalBT();

        System.out.println(s.isSymmetrical(b));

        System.out.println(s.isSymmetrical(a));

        System.out.println(s.isSymmetrical(d));

        System.out.println(s.isSymmetrical(d));
    }
}

class BinaryTree {

    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
        this.value = value;
    }
}