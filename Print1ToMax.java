public class Print1ToMax {

    private void print(int n) {
        if (n < 1) {
            return;
        }
        int max = 0;
        while (n >= 0) {
            n -= 1;
            max += (int) Math.pow(10, n) * 9;
        }
        System.out.println(max);
    }

    private void print1ToMax(int n) {
        if (n < 1) {
            return;
        }
        char[] c = new char[n];
        print1ToMax(c, 0);
    }

    private void print1ToMax(char[] c, int index) {
        if (index == c.length) {
            print(c);
            return;
        }
        for (int i = 0; i < 10; i++) {
            c[index] = (char) (i + '0');
            print1ToMax(c, index + 1);
        }
    }

    private void print(char[] c) {
        int index = 0;
        while (index < c.length && c[index] == '0') {
            index++;
        }
        while (index < c.length) {
            System.out.print(c[index++]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Print1ToMax p = new Print1ToMax();
        p.print1ToMax(1);
        p.print1ToMax(5);
        p.print1ToMax(0);
        p.print1ToMax(-1);
    }
}