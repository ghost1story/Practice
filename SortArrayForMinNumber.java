import java.util.Arrays;

public class SortArrayForMinNumber {

    int getMin(int[] num) {
        if (num == null) {
            return null;
        }
        String[] s = new String[num.length];
        for (int i = 0; i < num.length; i++) {
            s[i] = num[i] + "";
        }
        Arrays.sort(s, (a1, a2) -> (a1 + a2).compareTo(a2 + a1));
        StringBuilder sb = new StringBuilder();
        for (String temp : s) {
            sb.append(temp);
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        SortArrayForMinNumber s = new SortArrayForMinNumber();
        int[] n = {32, 1, 59};
        int[] n2 = {3, 1, 5};
        int[] n3 = {3, 32, 321};
        int[] n4 = {3, 323, 32123};
        int[] n5 = {1, 11, 111};
        int[] n6 = {532};
        System.out.println(s.getMin(n));
        System.out.println(s.getMin(n2));
        System.out.println(s.getMin(n3));
        System.out.println(s.getMin(n4));
        System.out.println(s.getMin(n5));
        System.out.println(s.getMin(n6));
    }
}