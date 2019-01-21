public class CuttingRope {

    private int getResult(int length) {
        if (length < 2) {
            return 0;
        }
        int[] dp = new int[length + 1];
        dp[1] = 1;
        for (int i = 2; i <= length; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[j] * (i - j)));
            }
        }
        return dp[length];
    }

    private int getResult2(int length) {
        if (length < 2) {
            return 0;
        }
        if (length == 2) {
            return 1;
        }
        if (length == 3) {
            return 2;
        }
        int timeOf3 = length / 3;
        if (length - timeOf3 * 3 == 1) {
            timeOf3--;
        }
        int timeOf2 = (length - timeOf3 * 3) / 2;
        return (int) (Math.pow(3, timeOf3) * Math.pow(2, timeOf2));
    }

    public static void main(String[] args) {
        CuttingRope c = new CuttingRope();
        System.out.println(c.getResult2(7));
        System.out.println(c.getResult2(8));
        System.out.println(c.getResult2(0));
        System.out.println(c.getResult2(1));
        System.out.println(c.getResult2(2));
    }
}