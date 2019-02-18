import java.util.ArrayList;

public class PathInTree {

    ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    ArrayList<ArrayList<Integer>> path(BinaryTree root, int sum) {
        if (root == null || sum <= 0) {
            return res;
        }
        path(root, sum, new ArrayList<>());
        return res;
    }

    void path(BinaryTree tree, int sum, ArrayList<Integer> path) {
        if (tree == null) {
            return;
        }
        path.add(tree.value);
        int target = sum;
        target -= tree.value;
        if (target == 0 && tree.left == null && tree.right == null) {
            res.add(new ArrayList<>(path));
        } else {
            path(tree.left, target, path);
            path(tree.right, target, path);
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
        System.out.println(p.path(b, 7));
        System.out.println(p.path(b, 6));
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