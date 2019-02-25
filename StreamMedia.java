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

    public static void main(String[] args) {
        StreamMedia s = new StreamMedia();
        s.insert(5);
        System.out.println(s.getMedia());
        s.insert(9);
        System.out.println(s.getMedia());
        s.insert(3);
        System.out.println(s.getMedia());
        s.insert(2);
        System.out.println(s.getMedia());        
        s.insert(4);
        System.out.println(s.getMedia());
    }
}