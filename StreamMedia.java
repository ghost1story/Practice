import java.util.PriorityQueue;

public class StreamMedia {

    PriorityQueue<Integer> left = new PriorityQueue<>((n1, n2) -> n2 - n1);
    PriorityQueue<Integer> right = new PriorityQueue<>();
    int n;

    void insert(int i) {
        if (n % 2 == 0) {
            left.add(i);
            right.add(left.poll());
        } else {
            right.add(i);
            left.add(right.poll());
        }
        n++;
    }

    int getMedia() {
        if (n % 2 == 0) {
            return (left.peek() + right.peek()) / 2;
        } else {
            return right.peek();
        }
    }
}