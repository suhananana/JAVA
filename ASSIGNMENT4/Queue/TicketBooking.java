import java.util.*;

public class TicketBooking {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll() + " got the ticket.");
        }
    }
}
