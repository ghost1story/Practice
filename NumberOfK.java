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
        return end - start + 1;
    }

    int getFirstResursively(int[] nums, int k, int start, int end) {
        if (start >= end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (nums[mid] == k && nums[mid - 1] != k) {
            return mid;
        } else if (nums[mid] == k && nums[mid - 1] == k) {
            getFirstResursively(nums, k, start, mid - 1);
        }
        if (nums[mid] < k) {
            getFirstResursively(nums, k, mid + 1, end);
        } else if (nums[mid] > k) {
            getFirstResursively(nums, k, start, mid - 1);
        }
        return -1;
    }

    int getEndResursively(int[] nums, int k, int start, int end) {
        if (start >= end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (nums[mid] == k && nums[mid + 1] != k) {
            return mid;
        } else if (nums[mid] == k && nums[mid + 1] == k) {
            getEndResursively(nums, k, mid + 1, end);
        }
        if (nums[mid] < k) {
            getEndResursively(nums, k, mid + 1, end);
        } else if (nums[mid] > k) {
            getEndResursively(nums, k, start, mid - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        NumberOfK k = new NumberOfK();
        int[] n = {1, 2, 3, 3, 3, 9};
        System.out.println(k.get(n, 3));
        System.out.println(k.get(n, 5));
    }
}