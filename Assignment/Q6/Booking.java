class TicketBooking {
    private int seats = 1;

    synchronized void bookSeat(String name) {
        if (seats > 0) {
            System.out.println(name + " booked the seat!");
            seats--;
        } else {
            System.out.println("Sorry " + name + ", seat not available.");
        }
    }
}

public class Booking {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        Thread t1 = new Thread(() -> booking.bookSeat("User1"));
        Thread t2 = new Thread(() -> booking.bookSeat("User2"));

        t1.start();
        t2.start();
    }
}
