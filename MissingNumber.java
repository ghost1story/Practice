public class MissingNumber {

    int get(int[] nums) {
        if (nums == null) {
            return -1;
        }
        /* for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return -2; */
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (nums[mid] != mid) {
                if (mid == 0 || nums[mid - 1] == mid - 1) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            } else {
                start = mid + 1;
            }
        }
        if (start == nums.length) {
            return start;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        int[] n2 = {0, 1, 2, 3, 5};
        int[] n3 = {0, 1, 3, 4, 5};
        int[] n4 = {0};
        int[] n5 = {1};
        MissingNumber m = new MissingNumber();
        System.out.println(m.get(n));
        System.out.println(m.get(n2));
        System.out.println(m.get(n3));
        System.out.println(m.get(n4));
        System.out.println(m.get(n5));
    }
}