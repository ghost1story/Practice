public class DigitsInSequence {

    int getDigit(int index) {
        if (index < 10) {
            return index;
        }
        int cur = 10;
        int bound = 10;
        int len = 2;
        while (cur + getLength(len) < index) {
            System.out.println("cur: " + cur + " len: " + len + " bound: " + bound);
            cur += getLength(len);
            len++;
            bound *= 10;
        }
        int curDigit = bound + (index - cur) / len;
        return Integer.toString(curDigit).charAt(
            index - cur - (curDigit - bound) * len) - '0';
    }

    int getLength(int len) {
        int res = 9;
        for (int i = 1; i < len; i++) {
            res *= 10;
        }
        return res * len;
    }

    public static void main(String[] args) {
        DigitsInSequence d = new DigitsInSequence();
        System.out.println(d.getDigit(189));
        System.out.println(d.getDigit(0));
        System.out.println(d.getDigit(1));
        System.out.println(d.getDigit(9));
        System.out.println(d.getDigit(1001));
    }
}