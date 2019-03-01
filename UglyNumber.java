public class UglyNumber {

    int get(int n) {
        if (n < 7) {
            return n;
        }
        int two = 0;
        int three = 0;
        int five = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int nextTwo = dp[two] * 2;
            int nextThree = dp[three] * 3;
            int nextFive = dp[five] * 5;
            dp[i] = Math.min(nextTwo, Math.min(nextThree, nextFive));
            if (dp[i] == nextTwo) {
                two++;
            }
            if (dp[i] == nextThree) {
                three++;
            }
            if (dp[i] == nextFive) {
                five++;
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        UglyNumber u = new UglyNumber();
        System.out.println(u.get(8));
        System.out.println(u.get(11));
        System.out.println(u.get(1500));
    }
}