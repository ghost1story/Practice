/**
 * 有右子树 -> 右子树下最下层的左子节点
 * 有右子树，右子树下无左子树 -> 右子节点
 * 无右子树 -> 向上，直到当前节点为上一节点的左子节点，
 * 返回该节点的上一个节点。若上一节点为空，则返回空
 */

public class NextNodeInBinaryTree {
 
    private TreeNode next(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode res = null;
        if (root.right != null) {
            root = root.right;
            while (root.left != null) {
                root = root.left;
            }
            res = root;
        } else {
            while (root.parent != null && root.parent.left != root) {
                root = root.parent;
            }
            res = root.parent;
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode n = new TreeNode(3);
        TreeNode n2 = new TreeNode(32);
        TreeNode n3 = new TreeNode(8);
        TreeNode n4 = new TreeNode(9);
        // n.right = n2;
        // n2.parent = n;
        // n2.left = n3;
        // n3.parent = n2;
        n.left = n2;
        n2.parent = n;
        n2.right = n3;
        n3.parent = n2;
        n3.right = n4;
        n4.parent = n3;

        NextNodeInBinaryTree t = new NextNodeInBinaryTree();
        System.out.println(t.next(n2).val);
        System.out.println(t.next(n3).val);
        System.out.println(t.next(n4).val);
        System.out.println(t.next(n).val);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode parent;

    public TreeNode(int val) { this.val = val; }
}