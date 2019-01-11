public class MinNumberInRotatedArray {

    private int getMin(int[] nums) {
        if (nums == null) {
            return -1;
        }
        int lo = 0;
        int hi = nums.length - 1;
        int mid;
        while (lo < hi) {
            mid = (lo + hi) >> 1;
            if (nums[mid] < nums[hi]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return nums[lo];
    }

    public static void main(String[] args) {
        int[] n = { 1, 2, 3, 4, 5 };
        System.out.println(new MinNumberInRotatedArray().getMin(n));
    }
}