class DaemonAutoSave {
    static class AutoSave extends Thread {
        public void run() {
            try {
                while (true) {
                    System.out.println("Auto-Save in progress...");
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AutoSave auto = new AutoSave();
        auto.setDaemon(true);
        auto.start();


        System.out.println("Main: starting file processing...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Processing file chunk " + i);
            Thread.sleep(1000);
        }

        System.out.println("Main done. JVM will exit and daemon will be terminated.");
    }
}
