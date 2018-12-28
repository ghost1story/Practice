import java.util.Arrays;

public class IsContinuous {

    private boolean isContinuous(int[] nums) {
        int len = nums.length;
        if (nums == null || len < 2) {
            return false;
        }
        Arrays.sort(nums);
        int magicNum = 0;
        for (int i : nums) {
            if (i == 0) {
                ++magicNum;
            }
        }
        for (int i = magicNum; i < len - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                return false;
            }
            magicNum -= nums[i + 1] - nums[i] - 1;
        }
        return magicNum >= 0;
    }

    public static void main(String[] args) {
        int[] n = { 2, 3 };
        int[] n2 = { 2, 7, 2 };
        int[] n3 = { 6, 7, 9, 0 };
        int[] n4 = { 6, 7, 9, 0, 2, 0 };
        int[] n5 = { 6, 7, 9, 0, 4, 0 };

        IsContinuous s = new IsContinuous();
        System.out.println(s.isContinuous(n));
        System.out.println(s.isContinuous(n2));
        System.out.println(s.isContinuous(n3));
        System.out.println(s.isContinuous(n4));
        System.out.println(s.isContinuous(n5));
    }
}