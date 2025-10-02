 class ThreadSleepExample {
    static class T1 extends Thread {
        public void run() {
            try {
                while (true) {
                    System.out.println("Thread 1");
                    Thread.sleep(1000); //1 sec delay
                }
            } catch (InterruptedException e) { }
        }
    }

    static class T2 extends Thread {
        public void run() {
            try {
                while (true) {
                    System.out.println("Thread 2"); // 2 sec delay
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) { }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        T2 t2 = new T2();
        t1.start();
        t2.start();

    }
}
