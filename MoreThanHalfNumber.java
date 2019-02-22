public class MoreThanHalfNumber {

    int get(int[] num) {
        if (num == null || num.length < 1) {
            return -1;
        }
        int cur = num[0];
        for (int i = 1, count = 1; i < num.length; i++) {
            count = cur == num[i] ? count + 1 : count - 1;
            if (count == 0) {
                cur = num[i];
                count = 1;
            }
        }
        int count = 0;
        for (int j : num) {
            if (j == cur) {
                count++;
            }
        }
        return count > num.length / 2 ? cur : -1;
    }

    public static void main(String[] args) {
        MoreThanHalfNumber m = new MoreThanHalfNumber();

        int[] i = { 1, 2, 2, 2, 3 };
        int[] i2 = { 1, 2, 2, 3 };
        int[] i3 = { 1, 2, 3, 5, 5, 5, 5 };
        int[] i4 = { 9, 9, 9, 1 };
        int[] i5 = { 5 };
        System.out.println(m.get(i));
        System.out.println(m.get(i2));
        System.out.println(m.get(i3));
        System.out.println(m.get(i4));
        System.out.println(m.get(i5));
        System.out.println(m.get(null));
    }
}