class EvenPrinterThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("EvenPrinterThread interrupted");
        }
    }

    public static void main(String[] args) {
        EvenPrinterThread t = new EvenPrinterThread();
        t.start();
    }
}
