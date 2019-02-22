public class SerializeBinaryTree {

    String res = null;
    
    static void connectBT(BinaryTree root, BinaryTree left, BinaryTree right) {
        root.left = left;
        root.right = right;
    }

    /* public static void printTree(BinaryTree root) {
	    printTreeNode(root);
	    if (root != null) {
	        if (root.left != null) {
                printTree(root.left);
            }
	        if (root.right != null) {
                printTree(root.right);
            }
	    }
	}

	public static void printTreeNode(BinaryTree node) {
	    if (node != null) {
	        System.out.println("node is: " + node.value);
	        if (node.left != null) {
                System.out.println("left child is: " + node.left.value);
            } else {
                System.out.println("left child is null");
            }
	        if (node.right != null) {
                System.out.println("right child is: " + node.right.value);
            } else {
                System.out.println("right child is null");
            }
	    } else {
	        System.out.println("node is null");
	    }
	    System.out.println();
	} */

    String serialize(BinaryTree t) {
        if (t == null) {
            return "#";
        }
        return t.value + " " + serialize(t.left) + " " + serialize(t.right);
    }

    BinaryTree deserialize(String s) {
        res = s;
        return deserialize();
    }

    BinaryTree deserialize() {
        if (res.length() == 0) {
            return null;
        }
        int index = res.indexOf(" ");
        String s = index == -1 ? res : res.substring(0, index);
        res = index == -1 ? "" : res.substring(index + 1);
        if (s.equals("#")) {
            return null;
        }
        int value = Integer.parseInt(s);
        BinaryTree b = new BinaryTree(value);
        b.left = deserialize();
        b.right = deserialize();
        return b;
    }

    BinaryTree seAndDe(BinaryTree t) {
        return deserialize(serialize(t));
    }

    static void printTree(BinaryTree root) {
        if (root != null) {
            System.out.println("value is " + root.value);
            printTree(root.left);
            printTree(root.right);
        }
    }

    public static void main(String[] args) {
        SerializeBinaryTree s = new SerializeBinaryTree();

        BinaryTree a = new BinaryTree(5);
        BinaryTree a2 = new BinaryTree(3);
        BinaryTree a3 = new BinaryTree(1);
        BinaryTree a4 = new BinaryTree(4);
        connectBT(a, a2, null);
        connectBT(a2, a3, a4);
        printTree(s.seAndDe(a));
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