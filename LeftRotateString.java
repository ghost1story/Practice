public class LeftRotateString {

    void rotate(String str, int n) {
        int len = str.length();
        if (str == null || n >= len) return;
        char[] c = str.toCharArray();
        reverse(c, 0, len - 1);
        reverse(c, 0, len - n - 1);
        reverse(c, len - n, len - 1);
        System.out.println(new String(c));
    }

    void reverse(char[] c, int i, int j) {
        char temp;
        while (i < j) {
            temp = c[i];
            c[i++] = c[j];
            c[j--] = temp;
        }
    }

    public static void main(String[] args) {
        LeftRotateString l = new LeftRotateString();
        String s = "abcd";
        l.rotate(s, 0);
        l.rotate(s, 1);
        l.rotate(s, 2);
        l.rotate(s, 4);
        l.rotate(s, 5);
        l.rotate("", 5);
    }
}