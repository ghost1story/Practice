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
            if (nums[lo] == nums[mid] && nums[mid] == nums[hi]) {
                return getMin(nums, lo, hi);
            } if (nums[mid] <= nums[hi]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return nums[lo];
    }

    private int getMin(int[] nums, int lo, int hi) {
        for (int i = lo; i < hi; i++) {
            if (nums[i] < nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[lo];
    }

    public static void main(String[] args) {
        int[] n = { 1, 2, 3, 4, 5 };
        int[] n2 = { 3, 4, 5, 1, 2 };
        int[] n3 = { 2, 2, 3, 3, 1 };
        int[] n4 = { 4 };

        MinNumberInRotatedArray m = new MinNumberInRotatedArray();
        System.out.println(m.getMin(n));
        System.out.println(m.getMin(n2));
        System.out.println(m.getMin(n3));
        System.out.println(m.getMin(n4));
    }
}