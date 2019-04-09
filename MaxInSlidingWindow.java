import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class MaxInSlidingWindow {

    void get(int[] nums, int size) {
        Deque<Integer> deque = new LinkedList<>();
        int len = nums.length;
        int begin = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            begin = i - size + 1;
            while (deque.peekFirst() != null && i - deque.peekFirst() + 1 > size) {
                deque.pollFirst();
            }
            while (deque.peekFirst() != null && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (begin >= 0) {
                list.add(nums[deque.peekFirst()]);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        MaxInSlidingWindow m = new MaxInSlidingWindow();
        int[] n = {3, 5, 2, 1, 0, 8};
        m.get(n, 3);
    }
}