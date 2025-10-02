class GracefulDownloader {
    static class Downloader extends Thread {
        private volatile boolean running = true;
        private int chunk = 1;

        public void run() {
            while (running && chunk <= 10) {
                System.out.println("Downloading chunk " + chunk++);
                try { Thread.sleep(300); } catch (InterruptedException e) { break; }
            }
            System.out.println("Downloader stopped gracefully.");
        }

        public void stopDownload() { running = false; }
    }

    public static void main(String[] args) throws InterruptedException {
        Downloader d = new Downloader();
        d.start();
        Thread.sleep(1200);
        System.out.println("Requesting stop...");
        d.stopDownload();
        d.join();
    }
}
