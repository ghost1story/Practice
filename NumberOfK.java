public class NumberOfK {

    /* int get(int[] nums, int k) {
        if (nums == null) {
            return -1;
        }
        int len = nums.length;
        int start = getFirstResursively(nums, k, 0, len - 1);
        int end = getEndResursively(nums, k, 0, len - 1);
        if (start == -1 || end == -1) {
            return -1;
        }
        return end - start + 1;
    } */

    int getFirstResursively(int[] nums, int k, int start, int end) {
        if (start > end) {
            return -1;
        }
        int res = -1;
        int mid = (start + end) / 2;
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

    int get(int[] nums, int k) {
        if (nums == null) {
            return -1;
        }
        int first = getNum(nums, k);
        int end = getNum(nums, k + 1);
        return (first == nums.length || nums[first] != k) ? 0 : end - first;
    }

    int getNum(int[] nums, int k) {
        /* int before = 0;
        int after = nums.length - 1;
        int mid = 0;
        while (before < after) {
            // System.out.println("before: " + before);
            // System.out.println("after: " + after);
            mid = (before + after) / 2;
            // System.out.println("mid: " + mid);
            if (nums[mid] == k && (mid == 0 || nums[mid - 1] != k)) {
                return mid;
            } else if ((nums[mid] == k && nums[mid - 1] == k) || nums[mid] > k) {
                after = mid - 1;
            } else if (nums[mid] < k) {
                before = mid + 1;
            }
        }
        return before; */

        int l = 0, h = nums.length;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (nums[m] >= k)
                h = m;
            else
                l = m + 1;
        }
        return l;
    }

    static boolean isRight(int num, int right) {
        return num == right ? true : false;
    }

    public static void main(String[] args) {
        NumberOfK k = new NumberOfK();
        int[] n = {1, 2, 3, 3, 3, 4};
        int[] n2 = {1, 2, 3, 3, 3, 3};
        int[] n3 = {3, 3, 3, 3, 4, 5};
        int[] n4 = {3, 3, 3, 3};
        int[] n5 = {2};
        System.out.println(isRight(k.get(n, 1), 1));
        System.out.println(isRight(k.get(n, 9), 0));
        System.out.println(isRight(k.get(n2, 3), 4));
        System.out.println(isRight(k.get(n3, 3), 4));
        System.out.println(isRight(k.get(n, 0), 0));
        System.out.println(isRight(k.get(n, 10), 0));
        System.out.println(isRight(k.get(n4, 3), 4));
        System.out.println(isRight(k.get(n5, 2), 1));
        System.out.println(isRight(k.get(n5, 5), 0));
    }
}