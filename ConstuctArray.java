public class ConstuctArray {

    private int[] multiply(int[] a) {
        int len = a.length;
        int[] b = new int[len];
        for (int i = 0, n = 1; i < len; n *= a[i], i++) {
            b[i] = n;
        }
        for (int i = len - 1, n = 1; i >= 0; n *= a[i], i--) {
            b[i] *= n;
        }
        return b;
    }

    private void printNum(int[] n) {
        for (int i : n) {
            System.out.println(i);
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        ConstuctArray c = new ConstuctArray();
        int[] n = { 1, 2, 3, 4, 5 };
        int[] n2 = { 1, 2, 0, 4, 5 };
        int[] n3 = { 1, 2, 0, 4, 0 };
        int[] n4 = { 1, -2, 3, -4, 5 };
        int[] n5 = { 1, -2 };
        int[] n6 = new int[0];

        int[] b = c.multiply(n);
        c.printNum(b);
        int[] b2 = c.multiply(n2);
        c.printNum(b2);
        int[] b3 = c.multiply(n3);
        c.printNum(b3);
        int[] b4 = c.multiply(n4);
        c.printNum(b4);
        int[] b5 = c.multiply(n5);
        c.printNum(b5);
        int[] b6 = c.multiply(n6);
        c.printNum(b6);
    }
}