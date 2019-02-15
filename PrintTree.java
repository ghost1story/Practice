import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTree {

    ArrayList<Integer> print(BinaryTree root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<BinaryTree> q = new LinkedList<>();
        q.add(root);
        while (q.size() > 0) {
            int count = q.size();
            while (count-- > 0) {
                BinaryTree t = q.poll();
                if (t != null) {
                    list.add(t.value);
                    q.add(t.left);
                    q.add(t.right);
                }
            }
        }
        return list;
    }

    /* void printChild(BinaryTree root) {
        if (root.left == null && root.right == null) {
            return;
        }
        if (root.left == null) {
            list.add(root.right.value);
        }
        if (root.right == null) {
            list.add(root.left.value);
        }
        print(root.left);
        print(root.right);
    } */

    static void connectBT(BinaryTree root, BinaryTree left, BinaryTree right) {
        root.left = left;
        root.right = right;
    }

    public static void main(String[] args) {
        PrintTree p = new PrintTree();
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
        System.out.println(p.print(b));

        BinaryTree a = new BinaryTree(1);
        BinaryTree a2 = new BinaryTree(2);
        BinaryTree a3 = new BinaryTree(3);
        BinaryTree a4 = new BinaryTree(4);
        connectBT(a, a2, null);
        connectBT(a2, a3, null);
        connectBT(a3, a4, null);
        System.out.println(p.print(a));

        BinaryTree c = new BinaryTree(5);
        BinaryTree c2 = new BinaryTree(9);
        BinaryTree c3 = new BinaryTree(2);
        BinaryTree c4 = new BinaryTree(1);
        connectBT(c, null, c2);
        connectBT(c2, null, c3);
        connectBT(c3, null, c4);
        System.out.println(p.print(c));

        System.out.println(p.print(new BinaryTree(8)));
        System.out.println(p.print(null));
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