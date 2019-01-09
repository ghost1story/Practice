public class Fibonacci {

    int[] cache;

    private int fibonacci(int n) {
        cache = new int[n];
        return get(n - 1) + get(n - 2);
    }

    private int get(int index) {
        if (index == 1) {
            cache[index] = 0;
            return cache[index];
        }
        if (index == 2) {
            cache[index] = 1;
            return cache[index];
        }
        if (cache[index] == 0) {
            return get(index - 1) + get(index - 2);
        } else {
            return cache[index];
        }
    }

    public static void main(String[] args) {
        System.out.println(new Fibonacci().fibonacci(5));
    }
}