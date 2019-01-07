import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTree {

    private Map<Integer, Integer> inOrders = new HashMap<>();

    private TreeNode construct(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0) {
            return null;
        }
        for (int i = 0; i < in.length; i++) {
            inOrders.put(in[i], i);
        }
        return construct(pre, 0, pre.length - 1, 0);
    }

    private TreeNode construct(int[] pre, int preL, int preR, int inL) {
        if (preL > preR) {
            return null;
        }
        TreeNode t = new TreeNode(pre[preL]);
        int inIndex = inOrders.get(t.val);
        int leftNums = inIndex - inL;
        t.left = construct(pre, preL + 1, preL + leftNums, inL);
        t.right = construct(pre, preL + leftNums + 1, preR, inL + leftNums + 1);
        return t;
    }

    public static void main(String[] args) {
        int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
        int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };

        System.out.println(new ConstructBinaryTree().construct(pre, in).val);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x) { val = x; }
}