import java.util.ArrayList;

public class KLeastNumbers {

    ArrayList getLeast(int[] num, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (num == null || num.length < 1 || k == 0) {
            return res;
        }
    }

    void findSmall(int[] num, int k) {
        int i = 0;
        int j = k;
        while (i < j) {
            int n = partition(num, i, j);
            if (n == k) {
                break;
            } else if (n < k) {
                j = n + 1;
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
            while (n != j && num[n++] < compare);
            while (m != i && num[m--] > compare);
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
}