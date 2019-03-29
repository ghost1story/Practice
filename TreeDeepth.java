public class TreeDeepth {

    int get(BinaryTree root) {
        if (root == null) return 0;
        int left = get(root.left);
        int right = get(root.right);
        return left > right ? left + 1 : right + 1;
    }
}