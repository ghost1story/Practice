import java.util.ArrayList;
import java.util.List;

public class LastRemaining {

    private int getLastRemaining(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int current = 0;
        while (list.size() > 1) {
            for (int i = 1; i < m; i++) {
                ++current;
                if (current == list.size()) {
                    current = 0;
                }
            }
            // System.out.println(current);
            list.remove(current);
            if (current == list.size()) {
                current = 0;
            }
            // System.out.println("value: " + list.get(current));
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        LastRemaining l = new LastRemaining();
        System.out.println(l.getLastRemaining(4, 3));
        System.out.println(l.getLastRemaining(6, 7));
        System.out.println(l.getLastRemaining(0, 4));
        System.out.println(l.getLastRemaining(4000, 997));
    }
}