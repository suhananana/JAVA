class AlternateNumbersWaitNotify {
    private final Object lock = new Object();
    private int number = 1;
    private final int MAX = 20;

    public void printOdd() {
        while (true) {
            synchronized (lock) {
                while (number % 2 == 0 && number <= MAX) {
                    try { lock.wait(); } catch (InterruptedException ignored) {}
                }
                if (number > MAX) { lock.notifyAll(); break; }
                System.out.println("OddThread: " + number++);
                lock.notifyAll();
            }
        }
    }

    public void printEven() {
        while (true) {
            synchronized (lock) {
                while (number % 2 == 1 && number <= MAX) {
                    try { lock.wait(); } catch (InterruptedException ignored) {}
                }
                if (number > MAX) { lock.notifyAll(); break; }
                System.out.println("EvenThread: " + number++);
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AlternateNumbersWaitNotify an = new AlternateNumbersWaitNotify();
        Thread t1 = new Thread(an::printOdd, "OddThread");
        Thread t2 = new Thread(an::printEven, "EvenThread");
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Done.");
    }
}
