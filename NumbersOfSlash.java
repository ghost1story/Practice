public class NumbersOfSlash {

    int getLeastFoot(int x, int y) {
        return Math.min(x, y) + Math.max(x, y) - Math.min(x, y);
    }

    int getRes(int x, int y, int k) {
        if (k < getLeastFoot(x, y)) return -1;
        else if (Math.abs(y - x) % 2 != 0) return k - 1;
        else if ((k - x) % 2 == 0) return k;
        else return k - 2;
    }

    public static void main(String[] args) {
        NumbersOfSlash t = new NumbersOfSlash();
        System.out.println(t.getRes(2, 3, 4));
        System.out.println(t.getRes(7, 7, 9));
        System.out.println(t.getRes(1, 2, 1));

        System.out.println(t.getRes(6, 8, 8));
        System.out.println(t.getRes(6, 7, 10));
        System.out.println(t.getRes(7, 6, 10));
        System.out.println(t.getRes(6, 8, 9));
        System.out.println(t.getRes(8, 6, 9));
    }
}