import java.util.Arrays;

public class IsContinuous {

    private boolean isContinuous(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return false;
        }
        Arrays.sort(nums);
        int magicNum = 0;
        for (int i = 0; i < len && nums[i] == 0; i++) {
            ++magicNum;
        }
        for (int i = 0; i < len - 1; i++) {
            magicNum -= nums[i + 1] - nums[i] - 1;
        }
        return magicNum >= 0;
    }

    public static void main(String[] args) {
        int[] n = { 2, 3 };
        int[] n2 = { 2, 7, 9 };
        int[] n3 = { 6, 7, 9, 0 };

        IsContinuous s = new IsContinuous();
        System.out.println(s.isContinuous(n));
        System.out.println(s.isContinuous(n2));
        System.out.println(s.isContinuous(n3));
    }
}