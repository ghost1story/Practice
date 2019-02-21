public class ConvertBinarySearchTree {

    BinaryTree val = null;
    BinaryTree head = null;

    BinaryTree convert(BinaryTree root) {
        startConvert(root);
        return head;
    }

    void startConvert(BinaryTree root) {
        if (root == null) {
            return;
        }
        convert(root.left);
        root.left = val;
        if (val != null) {
            val.right = root;
        }
        val = root;
        if (head == null) {
            head = root;
        }
        convert(root.right);
    }

    static void connectBT(BinaryTree root, BinaryTree left, BinaryTree right) {
        root.left = left;
        root.right = right;
    }

    static void printDouble(BinaryTree root) {
        while (root != null) {
            System.out.println("current node is " + root.value);
            if (root.left != null) {
                System.out.println(root.left.value);
            } else {
                System.out.println("left is null");
            }
            if (root.right != null) {
                System.out.println(root.right.value);
            } else {
                System.out.println("right is null");
            }
            root = root.right;
        }
    }

    public static void main(String[] args) {
        ConvertBinarySearchTree c = new ConvertBinarySearchTree();
        
        /* BinaryTree a = new BinaryTree(5);
        BinaryTree a2 = new BinaryTree(3);
        BinaryTree a3 = new BinaryTree(1);
        BinaryTree a4 = new BinaryTree(4);
        connectBT(a, a2, null);
        connectBT(a2, a3, a4);
        printDouble(c.convert(a)); */

        /* BinaryTree b = new BinaryTree(4);
        BinaryTree b2 = new BinaryTree(3);
        BinaryTree b3 = new BinaryTree(2);
        BinaryTree b4 = new BinaryTree(1);
        connectBT(b, b2, null);
        connectBT(b2, b3, null);
        connectBT(b3, b4, null);
        printDouble(c.convert(b)); */

        /* BinaryTree c1 = new BinaryTree(1);
        BinaryTree c2 = new BinaryTree(2);
        BinaryTree c3 = new BinaryTree(3);
        BinaryTree c4 = new BinaryTree(4);
        connectBT(c1, c2, null);
        connectBT(c2, c3, null);
        connectBT(c3, c4, null);
        printDouble(c.convert(c1)); */

        BinaryTree d = new BinaryTree(9);
        printDouble(c.convert(d));
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