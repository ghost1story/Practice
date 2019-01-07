import java.util.Map;

public class ConstructBinaryTree {

    private Map<Integer, Integer> inOrders = new Map<>();

    private TreeNode construct(int[] pre, int[] in) {
        for (int i = 0; i < in.length; i++) {
            inOrders.put(in[i], i);
        }
        return construct(pre, 0, pre.length - 1, 0);
    }

    private TreeNode construct(int[] pre, int preL, int preR, int inL) {
        TreeNode t = new TreeNode(pre[preL]);
        int inIndex = map.get(t.val);
        int leftNums = inIndex - inL;
        t.left = construct(pre, preL + 1, preL + leftNums, inL);
        t.right = construct(pre, preL + leftNums + 1, preR, inL + leftNums + 1);
        return t;
    }
}