public class NumberOfK {

    int get(int[] nums, int k) {
        if (nums == null) {
            return -1;
        }
        int len = nums.length;
        int start = getFirstResursively(nums, k, 0, len - 1);
        int end = getEndResursively(nums, k, 0, len - 1);
        if (start == -1 || end == -1) {
            return -1;
        }
        // System.out.println("start: " + start);
        // System.out.println("end: " + end);
        return end - start + 1;
    }

    int getFirstResursively(int[] nums, int k, int start, int end) {
        if (start > end) {
            return -1;
        }
        int res = -1;
        int mid = (start + end) / 2;
        // System.out.println("mid: " + mid);
        if (nums[mid] == k && (mid == 0 || nums[mid - 1] != k)) {
            res = mid;
        } else if (nums[mid] == k && nums[mid - 1] == k) {
            res = getFirstResursively(nums, k, start, mid - 1);
        } else if (nums[mid] < k) {
            res = getFirstResursively(nums, k, mid + 1, end);
        } else if (nums[mid] > k) {
            res = getFirstResursively(nums, k, start, mid - 1);
        }
        return res;
    }

    int getEndResursively(int[] nums, int k, int start, int end) {
        if (start > end) {
            return -1;
        }
        int res = -1;
        int mid = (start + end) / 2;
        // System.out.println("mid: " + mid);
        if (nums[mid] == k && (mid == nums.length - 1 || nums[mid + 1] != k)) {
            res = mid;
        } else if (nums[mid] == k && nums[mid + 1] == k) {
            res = getEndResursively(nums, k, mid + 1, end);
        } else if (nums[mid] < k) {
            res = getEndResursively(nums, k, mid + 1, end);
        } else if (nums[mid] > k) {
            res = getEndResursively(nums, k, start, mid - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        NumberOfK k = new NumberOfK();
        int[] n = {1, 2, 3, 3, 3, 9};
        int[] n2 = {1, 2, 3, 3, 3, 3};
        int[] n3 = {3, 3, 3, 3, 4, 7};
        int[] n4 = {3, 3, 3, 3};
        int[] n5 = {2};
        System.out.println(k.get(n, 1));
        System.out.println(k.get(n, 9));
        System.out.println(k.get(n2, 3));
        System.out.println(k.get(n3, 3));
        System.out.println(k.get(n, 0));
        System.out.println(k.get(n, 10));
        System.out.println(k.get(n4, 3));
        System.out.println(k.get(n5, 2));
        System.out.println(k.get(n5, 5));
    }
}