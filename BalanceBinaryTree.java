public class BalanceBinaryTree {

    /* boolean isBalance(BinaryTree root) {
        return Math.abs(getDeepth(root.left) - getDeepth(root.right)) < 2;
    }

    int getDeepth(BinaryTree root) {
        return root == null ? 0 : Math.max(getDeepth(root.left), getDeepth(root.right));
    } */

    boolean isBalance = true;

    boolean isBalance(BinaryTree root) {
        getDeepth(root);
        return isBalance;
    }

    int getDeepth(BinaryTree root) {
        if (root == null || !isBalance) return 0;
        int left = getDeepth(root.left);
        int right = getDeepth(root.right);
        if (Math.abs(left - right) > 1) isBalance = false;
        isBalance = true;
        return root == null ? 0 : Math.max(getDeepth(root.left), getDeepth(root.right)) + 1;
    }
}