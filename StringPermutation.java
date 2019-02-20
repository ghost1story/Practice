import java.util.ArrayList;
import java.util.Arrays;

public class StringPermutation {

    ArrayList<String> getString(String s) {
        ArrayList<String> res = new ArrayList<>();
        if (s == null || s.length() < 1) {
            return res;
        }
        char[] c = s.toCharArray();
        Arrays.sort(c);
        getString(c, new boolean[c.length], new StringBuilder(), res);
        return res;
    }

    void getString(char[] c, boolean[] isUsed, StringBuilder sb, ArrayList<> res) {
        if (sb.length() == c.length) {
            res.add(sb.toString());
            return;
        }
        for (int i = 0; i < isUsed.length; i++) {
            if (isUsed[i]) {
                continue;
            }
            if (i != 0 && c[i] == c[i - 1] && !isUsed[i]) {
                continue;
            }
            sb.append(c[i]);
            isUsed[i] = true;
            getString(c, isUsed, sb, res);
            sb.deleteCharAt(sb.length() - 1);
            isUsed[i] = false;
        }
    }

    public static void main(String[] args) {
        StringPermutation s = new StringPermutation();
        System.out.println(s.getString("a"));
        System.out.println(s.getString("ab"));
        System.out.println(s.getString("abb"));
        System.out.println(s.getString("abc"));
    }
}