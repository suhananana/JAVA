class InventorySyncBlock {
    static class Inventory {
        private int stock;
        private final Object lock = new Object();
        public Inventory(int stock) { this.stock = stock; }

        public void decrease(int amount, String threadName) {
            synchronized (lock) {
                if (stock >= amount) {
                    System.out.printf("%s decreasing %d from %d...%n", threadName, amount, stock);
                    try { Thread.sleep(50); } catch (InterruptedException ignored) {}
                    stock -= amount;
                    System.out.printf("%s done. New stock: %d%n", threadName, stock);
                } else {
                    System.out.printf("%s cannot decrease %d. Only %d left.%n", threadName, amount, stock);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Inventory inv = new Inventory(5);
        Runnable r = () -> {
            for (int i = 0; i < 3; i++) inv.decrease(2, Thread.currentThread().getName());
        };

        Thread t1 = new Thread(r, "T1");
        Thread t2 = new Thread(r, "T2");
        t1.start(); t2.start();
        t1.join(); t2.join();
    }
}
