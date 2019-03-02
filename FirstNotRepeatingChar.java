import java.util.BitSet;

public class FirstNotRepeatingChar {

    int get(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        BitSet b1 = new BitSet();
        BitSet b2 = new BitSet();
        for (char c : s.toCharArray()) {
            if (!b1.get(c) && !b2.get(c)) {
                b1.set(c);
            } else if (b1.get(c) && !b2.get(c)) {
                b2.set(c);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (b1.get(c) && !b2.get(c)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstNotRepeatingChar f = new FirstNotRepeatingChar();
        System.out.println(f.get("abc"));
        System.out.println(f.get("bbbacc"));
        System.out.println(f.get("baccba"));
        System.out.println(f.get("bbbbb"));
        System.out.println(f.get(null));
    }
}