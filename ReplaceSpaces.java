public class ReplaceSpaces {

    private char[] replace(char[] n) {
        if (n == null || n.length == 0) {
            return null;
        }
        int len = n.length;
        int spaces = 0;
        for (int i = 0; i < len; i++) {
            if (n[i] == ' ') {
                spaces++;
            }
        }
        char[] res = new char[len + spaces * 2];
        int i = len - 1;
        int j = res.length - 1;
        while (i >= 0 && j >= 0) {
            if (n[i] == ' ') {
                replaceSpace(res, j);
                j -= 2;
            } else {
                res[j] = n[i];
            }
            --i;
            --j;
        }
        return res;
    }

    private void replaceSpace(char[] n, int index) {
        n[index--] = '0';
        n[index--] = '2';
        n[index] = '%';
    }

    public static void main(String[] args) {
        String s = "just do it";
        ReplaceSpaces r = new ReplaceSpaces();

        System.out.println(r.replace(s.toCharArray()));
    }
}