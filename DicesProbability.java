public class DicesProbability {

    /* void get(int n) {
        int face = 6;
        int totalNum = n * 6;
        int[][] dp = new int[n + 1][totalNum + 1];
        for (int i = 1; i <= 6; i++)
            dp[1][i] = 1;
        for (int i = 2; i <= n; i++)
            for (int j = i; j <= totalNum; j++)
                for (int k = 1; k <= face && k <= j; k++)
                    dp[i][j] += dp[i - 1][j - k];
        for (int i = n; i <= totalNum; i++) {
            // printProbability(i, dp[n][i], Math.pow(6, n));
            System.out.println(i + ": " + dp[n][i]);
        }
    } */

    void get(int n) {
        if (n == 0) return;
        int face = 6;
        int totalNum = n * 6;
        int[][] dp = new int[2][totalNum + 1];
        for (int i = 1; i <= face; i++) {
            dp[0][i] = 1;
        }
        int flag = 1;
        for (int i = 2; i <= n; i++, flag = 1 - flag) {
            for (int j = 1; j <= totalNum; j++) {
                dp[flag][j] = 0;
            }
            for (int m = i; m <= totalNum; m++) {
                for (int k = 1; k <= face && k <= m; k++) {
                    dp[flag][m] += dp[1 - flag][m - k];
                }
            }
        }
        for (int i = 1; i <= totalNum; i++) {
            System.out.println(i + ": " + dp[1 - flag][i]);
        }
    }

    void printProbability(int point, int time, double totalTime) {
        System.out.println(point + ": " + time / totalTime);
    }

    public static void main(String[] args) {
        DicesProbability d = new DicesProbability();
        d.get(1);
        d.get(3);
        d.get(4);
        d.get(11);
        d.get(0);
    }
}