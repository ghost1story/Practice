public class MaxValueOfGifts {

    int getMax(int[][] value) {
        if (value == null || value.length == 0 || value[0].length == 0) {
            return -1;
        }
        int len = value[0].length;
        int[] dp = new int[len + 1];
        for (int[] v : value) {
            dp[0] += v[0];
            for (int i = 1; i < len; i++) {
                dp[i] = Math.max(dp[i], dp[i - 1]) + v[i];
            }
        }
        return dp[len - 1];
    }

    public static void main(String[] args) {
        MaxValueOfGifts m = new MaxValueOfGifts();
        int[][] n = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
        int[][] n2 = { { 1, 10, 3, 8 }, { 12, 2, 9, 6 }, { 5, 7, 4, 11 }, { 3, 7, 16, 5 } };
        int[][] n3 = { {1, 10, 3, 8} };
        int[][] n4 = {{ 1 }, { 12 }, { 5 }, { 3 }};
        int[][] n5 = {{3}};
        System.out.println(m.getMax(n));
        System.out.println(m.getMax(n2));
        System.out.println(m.getMax(n3));
        System.out.println(m.getMax(n4));
        System.out.println(m.getMax(n5));
    }
}