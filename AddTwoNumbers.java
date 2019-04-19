public class AddTwoNumbers {

    int add(int i, int j) {
        int sum = i ^ j;
        int carry = (i & j) << 1;
        int tempSum;
        while (carry != 0) {
            tempSum = sum;
            sum = sum ^ carry;
            carry = (tempSum & carry) << 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        AddTwoNumbers a = new AddTwoNumbers();
        System.out.println(a.add(1, 1) + "");
        System.out.println(a.add(3, 1) + "");
        System.out.println(a.add(7, 1) + "");
        System.out.println(a.add(0, 0) + "");
        System.out.println(a.add(-1, 2) + "");
        System.out.println(a.add(-1, -4) + "");
    }
}