public class DigitsInSequence {

    int getDigit(int index) {
        if (index < 10) {
            return index;
        }
        int cur = 10;
        int bound = 10;
        int len = 2;
        while (cur + getLength(len) < index) {
            cur += getLength(len);
            len++;
            bound *= 10;
        }
        int curDigit = cur + (index - bound) / len + "";
        return Integer.toString(curDigit).charAt(index - bound - curDigit * 3) - '0';
    }

    int getLength(int len) {
        if (len == 1) {
            return 10;
        }
        int j = 0;
        for (int i = 0; i < len; i++) {
            j = Math.pow(9, i - 1);
        }
        return j * len;
    }
}