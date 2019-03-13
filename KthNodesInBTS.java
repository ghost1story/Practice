public class KthNodesInBTS {

    int get(BinaryTree root, int k) {
        if (root == null || k <= 0) return -1;
        int[] n = inOrderTree(root);
        return n[k - 1];
    }

    int[] inOrderTree(BinaryTree root) {
        if (root == null) return;
        inOrderTree(root.left);
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