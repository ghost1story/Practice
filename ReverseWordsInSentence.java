public class ReverseWordsInSentence {

    void reverse(String str) {
        if (str == null) return;
        char[] c = str.toCharArray();
        int len = str.length();
        reverse(c, 0, len - 1);
        int after = 0;
        int before = 0;
        while (after <= len) {
            if (after == len || c[after] == ' ') {
                reverse(c, before, after - 1);
                before = after + 1;
            }
            ++after;
        }
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
        ReverseWordsInSentence r = new ReverseWordsInSentence();
        r.reverse("i am man.");
        r.reverse("man");
        r.reverse("man ");
        r.reverse(" man");
        r.reverse("  man");
        r.reverse("");
        r.reverse("   ");
    }
}