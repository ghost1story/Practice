public class FindDuplication {

    private int find(int[] n) {
        if (n == null) {
            return -1;
        }
        int len = n.length;
        for (int i = 0; i < len; i++) {
            if (n[i] < 0 || n[i] > len -1) {
                return -1;
            }
        }
        int temp = 0;
        for (int i = 0; i < len; i++) {
            while (i != n[i]) {
                if (n[i] == n[n[i]]) {
                    return n[i];
                } else {
                    temp = n[n[i]];
                    n[n[i]] = n[i];
                    n[i] = temp;                    
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] n = { 0, 3, 3, 1 };
        int[] n2 = { 2, 1, 3, 1, 4 };
        int[] n3 = { 2, 4, 2, 1, 4 };
        int[] n4 = { 2, 1, 3, 0, 4 };
        FindDuplication f = new FindDuplication();
        System.out.println(f.find(n));
        System.out.println(f.find(n2));
        System.out.println(f.find(n3));
        System.out.println(f.find(n4));
    }
}