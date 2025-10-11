class NumberPrinter extends Thread {
    private volatile boolean running = true;

    public void run() {
        int i = 1;
        while (running && i <= 100) {
            System.out.println(i);
            i++;
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
        System.out.println("Thread stopped safely.");
    }

    public void stopRunning() {
        running = false;
    }
}

public class StopThread{
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();
        printer.start();

        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        printer.stopRunning();
    }
}
