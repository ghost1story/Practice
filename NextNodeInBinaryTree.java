/** 
 * 有left -> left
 * 无left，有right -> right
 * 都无，是left -> 上一个
 * 都无，是right -> 向上直到当前为left的上一个
 */

public class NextNodeInBinaryTree {
 
    private TreeNOde next(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left != null && root.right != null) {
            if (root.left != null) {
                return root.left;
            } else {
                return root.rigth;
            }
        }
        if (root.parent != null) {
            if (root.parent.left.val == root.val) {
                return root.parent;
            } else {
                while (parent.left.val != next.val) {
                    TreeNode parent = root.parent;
                    TreeNode next = root;
                    next = parent;
                    parent = parent.parent;
                }
            }
        }
    }
}