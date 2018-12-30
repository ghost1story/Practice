public class AddTwoNumber {

    private int add(int n1, int n2) {
        int num = 0;
        int carry = 0;
        do {
            num = n1 ^ n2;
            carry = (n1 & n2) << 1;
            n1 = num;
            n2 = carry;
        } while (carry != 0);
        return num;
    }

    public static void main(String[] args) {
        AddTwoNumber a = new AddTwoNumber();
        System.out.println(a.add(6, 5));
        System.out.println(a.add(0, 0));
        System.out.println(a.add(-2, -9));
    }
}