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

    public static void main(String[] args) {
        Print1ToMax p = new Print1ToMax();
        p.print(1);
        p.print(5);
        p.print(10);
    }
}