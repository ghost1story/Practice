public class FindDuplicationNoEdit {

    private int find(int[] n) {
        if (n == null) {
            return -1;
        }
        int start = 1;
        int end = n.length - 1;
        while (end >= start) {
            int mid = (start + end) >> 1;
            // System.out.println("mid: " + mid);
            int count = getCount(n, start, mid);
            // System.out.println("count: " + count);
            if (start == end) {
                if (count > 1) {
                    return start;
                } else {
                    break;
                }
            }
            if (count > mid - start + 1) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private int getCount(int[] n, int start, int end) {
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] >= start && n[i] <= end) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] n = { 1, 2, 2 };
        int[] n2 = { 1, 1, 3, 3 };
        int[] n3 = { 0, 1, 2 };
        int[] n4 = { 0, 1, 5 };

        FindDuplicationNoEdit f = new FindDuplicationNoEdit();
        System.out.println(f.find(n));
        System.out.println(f.find(n2));
        System.out.println(f.find(n3));
        System.out.println(f.find(n4));
    }
}