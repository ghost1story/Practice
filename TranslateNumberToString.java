public class TranslateNumberToString {

    int getRes(String s) {
        if (s == null || s.length() == 0 || Integer.parseInt(s) < 0) {
            return -1;
        }
        int len = s.length();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= len; i++) {
            dp[i] += dp[i - 1];
            int two = Integer.parseInt(s.substring(i - 2, i));
            if (two >= 10 && two < 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[len];
    }

    public static void main(String[] args) {
        TranslateNumberToString t = new TranslateNumberToString();
        System.out.println(t.getRes("12258"));
        System.out.println(t.getRes("126"));
        System.out.println(t.getRes("125"));
        System.out.println(t.getRes("100"));
        System.out.println(t.getRes("-100"));
    }
}