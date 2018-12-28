public class MaxDiff {

    private int getMaxDiff(int[] n) {
        if (n == null || n.length < 2) {
            return -1;
        }
        int len = n.length;
        int min = n[0];
        int maxDiff = n[1] - min;
        for (int i = 2; i < len; i++) {
            if (n[i - 1] < min) {
                min = n[i - 1];
            }
            if (n[i] - min > maxDiff) {
                maxDiff = n[i] - min;
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int[] n = { 5, 6, 11 };
        int[] n2 = { 4, 1, 3, 2, 5 };
        int[] n3 = { 16, 11, 7, 4, 2, 1 };
        int[] n4 = { 4, 2 };
        int[] n5 = { 1, 1, 1, 1 };

        MaxDiff m = new MaxDiff();
        System.out.println(m.getMaxDiff(n));
        System.out.println(m.getMaxDiff(n2));
        System.out.println(m.getMaxDiff(n3));
        System.out.println(m.getMaxDiff(n4));
        System.out.println(m.getMaxDiff(n5));
    }
}