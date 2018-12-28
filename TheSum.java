public class TheSum {

    private int getSum(int n) {
        int sum = n;
        boolean a = (n > 0) && ((sum += getSum(n - 1)) == 0);
        return sum;
    }

    public static void main(String[] args) {
        TheSum t = new TheSum();
        System.out.println(t.getSum(5));
        System.out.println(t.getSum(10));
        System.out.println(t.getSum(0));
        System.out.println(t.getSum(1));
    }
}