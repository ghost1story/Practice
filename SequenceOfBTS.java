public class SequenceOfBTS {

    boolean confirm(int[] s) {
        if (s == null || s.length == 0) {
            return false;
        }
        return confirm(s, 0, s.length - 1);
    }

    boolean confirm(int[] s, int first, int last) {
        if (last - first <= 1) {
            return true;
        }
        int index = first;
        while (index < last && s[index] <= s[last]) {
            index++;
        }
        for (int i = index; i < last; i++) {
            if (s[i] < s[last]) {
                return false;
            }
        }
        return confirm(s, first, index - 1) && confirm(s, index, last - 1);
    }

    public static void main(String[] args) {
        int[] i = { 1, 5, 3, 6, 9, 7, 4 };
        int[] i2 = { 1, 2, 3, 6, 9, 7, 4 };
        int[] i3 = { 1, 2, 3, 4, 5 };
        int[] i4 = { 5, 4, 3, 2, 1 };
        int[] i5 = { 5, 8, 7, 11, 12, 10 };
        SequenceOfBTS s = new SequenceOfBTS();
        System.out.println(s.confirm(i));
        System.out.println(s.confirm(i2));
        System.out.println(s.confirm(i3));
        System.out.println(s.confirm(i4));
        System.out.println(s.confirm(i5));
    }
}