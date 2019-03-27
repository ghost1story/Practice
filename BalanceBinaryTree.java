public class BalanceBinaryTree {

    boolean isBalance(BinaryTree root) {
        if (root == null) return true;
        return Math.abs(getDeepth(root.left) - getDeepth(root.right)) < 2;
    }

    int getDeepth(BinaryTree root) {
        return root == null ? 0 : Math.max(getDeepth(root.left), getDeepth(root.right)) + 1;
    }
}