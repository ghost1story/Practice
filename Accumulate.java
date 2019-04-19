public class Accumulate {

    int getSum(int n) {
        int sum = 0;
        boolean b = n > 0 && (sum += n + getSum(n - 1)) > 0;
        return sum;
    }
    
    public static void main(String[] args) {
        Accumulate a = new Accumulate();
        System.out.println(a.getSum(0));
        System.out.println(a.getSum(1));
        System.out.println(a.getSum(3));
        System.out.println(a.getSum(10));
        System.out.println(a.getSum(100));
    }
}