import java.util.ArrayList;

public class TwoNumbersWithSum {

    void get(int[] nums, int sum) {
        if (nums == null) return;
        ArrayList<Integer> list = new ArrayList<>();
        int head = 0;
        int end = nums.length - 1;
        while (head < end) {
            if (nums[head] + nums[end] == sum) {
                list.add(nums[head]);
                list.add(nums[end]);
                break;
            } else if (nums[head] + nums[end] < sum) {
                ++head;
            } else {
                --end;
            }
        }
        System.out.println(list.toString());
    }

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6, 9};
        TwoNumbersWithSum t = new TwoNumbersWithSum();
        t.get(n, 10);
        t.get(n, 9);
        t.get(n, 20);
    }
}