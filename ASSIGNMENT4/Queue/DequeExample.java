import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.addFirst("Front");
        dq.addLast("Back");
        System.out.println(dq);

        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
    }
}
