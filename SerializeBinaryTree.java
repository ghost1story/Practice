public class SerializeBinaryTree {

    String res = null;
    
    static void connectBT(BinaryTree root, BinaryTree left, BinaryTree right) {
        root.left = left;
        root.right = right;
    }

    String serialize(BinaryTree t) {
        if (t == null) {
            return "#";
        }
        return t.value + " " + serialize(t.left) + " " + serialize(t.right);
    }

    BinaryTree deserialize(String s) {
        res = s;
        return deserialize();
    }

    BinaryTree deserialize() {
        int index = res.indexOf(" ");
        String s = index == -1 ? null : res.substring(0, index);
        res = index == -1 ? "" : res.substring(index + 1, res.length());
        int value = Integer.parseInt(s);
        BinaryTree b = new BinaryTree(value);
        b.left = deserialize();
        b.right = deserialize();
        return b;
    }

    BinaryTree seAndDe(BinaryTree t) {
        return deserialize(serialize(t));
    }

    static void printTree(BinaryTree root) {
        while (root != null) {
            System.out.println("value is " + root.value);
            System.out.print("left ");
            printTree(root.left);
            System.out.print("right ");
            printTree(root.right);
        }
    }

    public static void main(String[] args) {
        SerializeBinaryTree s = new SerializeBinaryTree();

        BinaryTree a = new BinaryTree(5);
        BinaryTree a2 = new BinaryTree(3);
        BinaryTree a3 = new BinaryTree(1);
        BinaryTree a4 = new BinaryTree(4);
        connectBT(a, a2, null);
        connectBT(a2, a3, a4);
        printTree(s.seAndDe(a));
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