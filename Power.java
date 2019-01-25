public class Power {

    private double power(double base, int exponent) {
        if (base == 0 && exponent == -1) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        boolean isNative = false;
        if (exponent < 0) {
            exponent = -exponent;
            isNative = true;
        }
        double res = power(base * base, exponent >> 1);
        if (exponent % 2 != 0) {
            res *= base;
        }
        return isNative ? 1 / res : res;
    }
}