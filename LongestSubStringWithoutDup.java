import java.util.Arrays;

public class LongestSubStringWithoutDup {

    int get(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        int[] index = new int[26];
        Arrays.fill(index, -1);
        int cur = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int pre = s.charAt(i) - 'a';
            if (index[pre] == -1 || i - index[pre] > cur) {
                cur++;
            } else {
                max = Math.max(cur, max);
                cur = i - index[pre];
            }
            index[pre] = i;
        }
        max = Math.max(cur, max);
        return max;
    }

    public static void main(String[] args) {
        LongestSubStringWithoutDup l = new LongestSubStringWithoutDup();
        System.out.println(l.get("a"));
        System.out.println(l.get("abc"));
        System.out.println(l.get("aabacdd"));
        System.out.println(l.get("aaaa"));
    }
}