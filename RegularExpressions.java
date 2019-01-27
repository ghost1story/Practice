public class RegularExpressions {

    private boolean match(char[] s, char[] pattern) {
        if (s == null || pattern == null) {
            return false;
        }
        return match(s, pattern, 0, 0);
    }

    private boolean match(char[] s, char[] pattern, int i, int j) {
        if (i == s.length && j == pattern.length) {
            return true;
        }
        if (i != s.length && j == pattern.length) {
            return false;
        }
        if (pattern[j + 1] == '*') {
            if (s[i] == pattern[j] || (pattern[j] == '.' && s[i] != ' ')) {
                return match(s, pattern, i + 1, j) || match(s, pattern, i + 1, j + 2)
                    || match(s, pattern, i, j);
            } else {
                return match(s, pattern, i, j + 2);
            }
        }
        if (s[i] == pattern[j] || (pattern[j] == '.' && s[i] != ' ')) {
            return match(s, pattern, i + 1, j + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        char[] c = "aaa".toCharArray();
        char[] c2 = "a.a".toCharArray();
        char[] c3 = "a*".toCharArray();
        char[] c4 = ".*".toCharArray();
        char[] c5 = "ab*".toCharArray();
        char[] c6 = "a*b*".toCharArray();

        RegularExpressions r = new RegularExpressions();
        System.out.println(r.match(c, c2));
        System.out.println(r.match(c, c3));
        System.out.println(r.match(c, c4));
        System.out.println(r.match(c, c5));
        System.out.println(r.match(c, c6));
    }
}