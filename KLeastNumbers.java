import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLeastNumbers {

    /* ArrayList getLeast(int[] num, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (num == null || num.length < 1 || k == 0) {
            return res;
        }
        findSmall(num, k - 1);
        for (int i = 0; i < Math.min(k, num.length); i++) {
            res.add(num[i]);
        }
        return res;
    } */

    void findSmall(int[] num, int k) {
        int i = 0;
        int j = num.length - 1;
        while (i < j) {
            int n = partition(num, i, j);
            if (n == k) {
                break;
            } else if (n < k) {
                i = n + 1;
            } else {
                j = n - 1;
            }
        }
    }
    
    int partition(int[] num, int i, int j) {
        int compare = num[i];
        int n = i;
        int m = j + 1;
        while (true) {
            while (n != j && num[++n] < compare);
            while (m != i && num[--m] > compare);
            if (n >= m) {
                break;
            }
            swap(num, n, m);
        }
        swap(num, i, m);
        return m;
    }

    void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    ArrayList<Integer> getLeast(int[] num, int k) {
        if (num == null || num.length < 1 || k <= 0) {
            return new ArrayList<>();
        }
        PriorityQueue<Integer> max = new PriorityQueue<>((k1, k2) -> k2 - k1);
        for (int n : num) {
            max.add(n);
            if (max.size() > k) {
                max.poll();
            }
        }
        return new ArrayList<>(max);
    }
    
    public static void main(String[] args) {
        KLeastNumbers k = new KLeastNumbers();
        
        int[] n = {4, 5, 9, 5, 1};
        int[] n2 = {4, 5, 9, 12, 1};
        System.out.println(k.getLeast(n, 5));
        System.out.println(k.getLeast(n2, 0));
        System.out.println(k.getLeast(n2, 1));
        System.out.println(k.getLeast(n2, 3));
        System.out.println(k.getLeast(n2, 5));
        System.out.println(k.getLeast(n2, 9));
    }
}