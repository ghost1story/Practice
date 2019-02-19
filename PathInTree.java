import java.util.ArrayList;

public class PathInTree {

    ArrayList<ArrayList<Integer>> path(BinaryTree root, int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null || sum <= 0) {
            return res;
        }
        path(root, sum, new ArrayList<>(), res);
        return res;
    }

    void path(BinaryTree tree, int target, ArrayList<Integer> path,
            ArrayList<ArrayList<Integer>> res) {
        if (tree == null) {
            return;
        }
        path.add(tree.value);
        target -= tree.value;
        if (target == 0 && tree.left == null && tree.right == null) {
            res.add(new ArrayList<>(path));
        } else {
            path(tree.left, target, path, res);
            path(tree.right, target, path, res);
        }
        path.remove(path.size() - 1);
    }

    static void connectBT(BinaryTree root, BinaryTree left, BinaryTree right) {
        root.left = left;
        root.right = right;
    }

    public static void main(String[] args) {
        PathInTree p = new PathInTree();
        BinaryTree b = new BinaryTree(1);
        BinaryTree b2 = new BinaryTree(2);
        BinaryTree b3 = new BinaryTree(3);
        BinaryTree b4 = new BinaryTree(9);
        BinaryTree b5 = new BinaryTree(4);
        BinaryTree b6 = new BinaryTree(9);
        BinaryTree b7 = new BinaryTree(3);
        connectBT(b, b2, b3);
        connectBT(b2, b4, b5);
        connectBT(b3, b6, b7);
        System.out.println(p.path(b, 12));
        // System.out.println(p.path(b, 17));

        BinaryTree a = new BinaryTree(1);
        BinaryTree a2 = new BinaryTree(2);
        BinaryTree a3 = new BinaryTree(3);
        BinaryTree a4 = new BinaryTree(4);
        connectBT(a, a2, null);
        connectBT(a2, a3, null);
        connectBT(a3, a4, null);
        System.out.println(p.path(a, 10));

        BinaryTree c = new BinaryTree(5);
        BinaryTree c2 = new BinaryTree(9);
        BinaryTree c3 = new BinaryTree(2);
        BinaryTree c4 = new BinaryTree(1);
        connectBT(c, null, c2);
        connectBT(c2, null, c3);
        connectBT(c3, null, c4);
        System.out.println(p.path(c, 17));

        BinaryTree d = new BinaryTree(88);
        System.out.println(p.path(d, 88));
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