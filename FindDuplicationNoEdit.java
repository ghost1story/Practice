public class FindDuplicationNoEdit {

    private int find(int[] n) {
        if (n == null) {
            return -1;
        }
        int start = 0;
        int end = n.length - 1;
        while (end >= start) {
            int mid = (start + end) >> 1;
            int count = getCount(n, start, mid);
            if (start == mid) {
                if (count > 1) {
                    return start;
                } else {
                    break;
                }
            }
            if (count > mid - start + 1) {
                end = mid;
            } else {
                start = mid;
            }
        }
    }

    private int getCount(int[] n, int start, int end) {
        int count = 0;
        for ()
    }
}