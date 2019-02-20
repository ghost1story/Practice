public class ConvertBinarySearchTree {

    void convert(BinaryTree root) {
        if (root == null) {
            return;
        }
        convert(root.left);
        root.left = val;
        if (val != null) {
            val.right = root;
        }
        val = root;
        convert(root.right);
    }
}