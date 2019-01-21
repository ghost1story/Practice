public class NumberOf1 {

    private int get(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }

    private int get2(int n) {
        int count = 0;
        int flag = 1;
        // flag 左移 32 位后变为 0
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOf1 n = new NumberOf1();
        System.out.println(n.get2(7));
        System.out.println(n.get2(8));
        System.out.println(n.get2(0));
        System.out.println(n.get2(1));
        System.out.println(n.get2(0xFFFFFFFF));
        System.out.println(n.get2(0x7FFFFFFF));
    }
}