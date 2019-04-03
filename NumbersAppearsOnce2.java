public class NumbersAppearsOnce2 {

    void get(int[] nums) {
        if (nums == null) return;
        int[] sum = new int[32];
        for (int i = 0; i < nums.length; i++) {
            int bit = 1;
            for (int j = 31; j >= 0; j--) {
                if ((nums[i] & bit) != 0) {
                    sum[j] += 1;
                }
                bit = bit << 1;
            }
        }
        int res = 0;
        for (int i : sum) {
            res = res << 1;
            if (i % 3 == 1) {
                res += 1;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        NumbersAppearsOnce2 a = new NumbersAppearsOnce2();
        int[] n = {2, 3, 3, 3, 1, 1, 1};
        int[] n2 = {2, 5, 5, 5, 8, 8, 8};
        int[] n3 = {9, 5, 5, 5, 8, 8, 8};
        int[] n4 = {5};
        int[] n5 = {-2, 1, 1, 1};
        int[] n6 = {2, -3, -3, -3, -5, -5, -5};
        int[] n7 = {1, -3, -3, -3, 5, 5, 5};
        int[] n8 = {-1, -7, -7, -7};
        int[] n9 = {-23, 0, 214, -23, 214, -23, 214};
        int[] n10 = {0, 3467, 0, 0, 0, 0, 0, 0};
        a.get(n);
        a.get(n2);
        a.get(n3);
        a.get(n4);
        a.get(n5);
        a.get(n6);
        a.get(n7);
        a.get(n8);
        a.get(n9);
        a.get(n10);
    }
}