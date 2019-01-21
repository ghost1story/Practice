public class NumberOf1 {

    private int get(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOf1 n = new NumberOf1();
        System.out.println(n.get(7));
        System.out.println(n.get(8));
        System.out.println(n.get(0));
        System.out.println(n.get(1));
        System.out.println(n.get(0xFFFFFFFF));
        System.out.println(n.get(0x7FFFFFFF));
    }
}