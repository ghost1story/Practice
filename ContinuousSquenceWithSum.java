import java.util.ArrayList;

public class ContinuousSquenceWithSum {

    void get(int sum) {
        int head = 1;
        int end = 2;
        int curSum = 0;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        while (head <= (1 + sum) / 2) {
            curSum = getTotalSum(head, end);
            if (curSum == sum) {
                list.add(setList(new ArrayList<Integer>(), head, end));
                ++head;
            } else if (curSum < sum) {
                ++end;
            } else {
                ++head;
            }
        }
        System.out.println(list.toString());
    }

    int getTotalSum(int head, int end) {
        int res = 0;
        for (int i = head; i <= end; i++) {
            res += i;
        }
        return res;
    }

    ArrayList<Integer> setList(ArrayList<Integer> list, int head, int end) {
        for (int i = head; i <= end; i++) {
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        ContinuousSquenceWithSum c = new ContinuousSquenceWithSum();
        c.get(1);
        c.get(3);
        c.get(4);
        c.get(5);
        c.get(9);
        c.get(15);
        c.get(100);
    }
}