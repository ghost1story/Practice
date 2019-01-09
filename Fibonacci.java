public class Fibonacci {

    private int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int pre1 = 1;
        int pre2 = 0;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = pre1 + pre2;
            pre2 = pre1;
            pre1 = res;
        }
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(new Fibonacci().fibonacci(5));
    }
}