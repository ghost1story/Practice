public class MirrorOfBinaryTree {

    void mirror(BinaryTree parent) {
        if (parent == null) {
            return;
        }
        if (parent.left == null && parent.right == null) {
            return;
        }
        mirror(parent.left);
        mirror(parent.right);
        BinaryTree temp = null;
        temp = parent.left;
        parent.left = parent.right;
        parent.right = temp;
    }

    static void connectBT(BinaryTree root, BinaryTree left, BinaryTree right) {
        root.left = left;
        root.right = right;
    }

    public static void printTree(BinaryTree root) {
	    printTreeNode(root);
	    if(root != null) {
	        if(root.left != null)
	            printTree(root.left);
	        if(root.right != null)
	        	printTree(root.right);
	    }
	}

	public static void printTreeNode(BinaryTree node) {
	    if (node != null) {
	        System.out.println("node is: " + node.value);
	        if (node.left != null) {
                System.out.println("left child is: " + node.left.value);
            } else {
                System.out.print("left child is null.\n");
            }
	        if (node.right != null) {
                System.out.println("right child is: " + node.right.value);
            } else {
                System.out.print("right child is null.\n");
            }
	    } else {
	        System.out.print("node is null.\n");
	    }
	    System.out.println();
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
        
        MirrorOfBinaryTree m = new MirrorOfBinaryTree();

        m.mirror(b);
        printTree(b);

        m.mirror(a);
        printTree(a);

        m.mirror(d);
        printTree(c);

        m.mirror(d);
        printTree(d);
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