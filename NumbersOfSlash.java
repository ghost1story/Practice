public class Two {

    int getLeastFoot(int x, int y) {
        return Math.min(x, y) + Math.max(x, y) - Math.min(x, y);
    }

    int getRes(int x, int y, int k) {
        if (k < getLeastFoot(x, y)) return -1;
        else if (k == getLeastFoot(x, y)) return Math.min(x, y);
        else return Math.max(x, y);
    }

    public static void main(String[] args) {
        Two t = new Two();
        System.out.println(t.getRes(2, 3, 4));
        System.out.println(t.getRes(7, 7, 9));
        System.out.println(t.getRes(1, 2, 1));
    }
}