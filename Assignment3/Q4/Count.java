class CountdownTick {
    static class Tick extends Thread {
        private volatile boolean running = true;
        public void run() {
            try {
                while (running) {
                    System.out.println("Tick...");
                    Thread.sleep(500);
                }
            }
            catch (InterruptedException e) {}
        }
        public void stopTick() { running = false; }
    }

    public static void main(String[] args) throws InterruptedException {
        Tick t = new Tick();
        t.start();
        for (int i = 10; i >= 1; i--) {
            System.out.println("Countdown: " + i);
            Thread.sleep(1000);
        }
        t.stopTick();
        Thread.sleep(600);
        System.out.println("Done.");
    }
}
