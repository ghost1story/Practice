import java.util.ArrayList;

public class KthNodesInBTS {

    int res = -1;
    int count;

    int get(BinaryTree root, int k) {
        if (root == null || k <= 0) return -1;
        // ArrayList<Integer> list = new ArrayList<>();
        // inOrderTree(root, k);
        // return k > list.size() ? -1 : list.get(list.size() - k);
        inOrderTree(root, k);
        return res;
    }

    void inOrderTree(BinaryTree root, ArrayList<Integer> list) {
        if (root == null) return;
        inOrderTree(root.left, list);
        list.add(root.value);
        inOrderTree(root.right, list);
    }

    void inOrderTree(BinaryTree root, int k) {
        // if (root == null) return;
        // inOrderTree(root.left, k);
        // k--;
        // if (k == 0) res = root.value;
        // inOrderTree(root.right, k);
        if (root == null || count >= k) return;
        inOrderTree(root.left, k);
        count++;
        if (count == k) res = root.value;
        inOrderTree(root.right, k);
    }

    static void connectBT(BinaryTree root, BinaryTree left, BinaryTree right) {
        root.left = left;
        root.right = right;
    }

    static void isRight(BinaryTree root, int k, int expect) {
        KthNodesInBTS ins = new KthNodesInBTS();
        // System.out.println(ins.get(root, k));
        System.out.println(ins.get(root, k) == expect ? true : false);
    }

    public static void main(String[] args) {
        BinaryTree b1 = new BinaryTree(5);
        BinaryTree b2 = new BinaryTree(3);
        BinaryTree b3 = new BinaryTree(7);
        BinaryTree b4 = new BinaryTree(1);
        BinaryTree b5 = new BinaryTree(4);
        BinaryTree b6 = new BinaryTree(6);
        BinaryTree b7 = new BinaryTree(9);
        connectBT(b1, b2, b3);
        connectBT(b2, b4, b5);
        connectBT(b3, b6, b7);

        isRight(b1, 0, -1);
        isRight(b1, 1, 1);
        isRight(b1, 2, 3);
        isRight(b1, 3, 4);
        isRight(b1, 5, 6);
        isRight(b1, 7, 9);
        isRight(b1, 8, -1);

        // BinaryTree b8 = new BinaryTree(6);
        // BinaryTree b9 = new BinaryTree(5);
        // BinaryTree b10 = new BinaryTree(4);
        // connectBT(b8, b9, null);
        // connectBT(b9, b10, null);
        // isRight(b8, 6, -1);
        // isRight(b8, 1, 6);
        // isRight(b8, 3, 4);

        // BinaryTree c1 = new BinaryTree(7);
        // BinaryTree c2 = new BinaryTree(8);
        // BinaryTree c3 = new BinaryTree(9);
        // connectBT(c1, null, c2);
        // connectBT(c2, null, c3);
        // isRight(c1, 1, 9);
        // isRight(c1, 3, 7);

        // BinaryTree c4 = new BinaryTree(1);
        // isRight(c4, 1, 1);
        // isRight(c4, 2, -1);
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