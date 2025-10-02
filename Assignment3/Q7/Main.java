class TicketBookingSync {
    static class TicketCounter {
        private int available;
        public TicketCounter(int available) { this.available = available; }


        public synchronized boolean bookTicket(int num, String user) {
            if (num <= 0) return false;
            if (available >= num) {
                System.out.printf("%s booking %d ticket(s)...%n", user, num);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                available -= num;
                System.out.printf("%s SUCCESS. Remaining: %d%n", user, available);
                return true;
            } else {
                System.out.printf("%s FAILED to book %d ticket(s). Remaining: %d%n", user, num, available);
                return false;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TicketCounter counter = new TicketCounter(5);
        Runnable user1 = () -> counter.bookTicket(3, "User-1");
        Runnable user2 = () -> counter.bookTicket(3, "User-2");

        Thread t1 = new Thread(user1);
        Thread t2 = new Thread(user2);
        t1.start(); t2.start();
        t1.join(); t2.join();
    }
}
