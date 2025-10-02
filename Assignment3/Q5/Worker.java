class NamedPriorityWorkers {
    static class Worker extends Thread {
        public Worker(String name, int priority) {
            super(name);
            setPriority(priority);
        }
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.printf("%s (priority %d) is running: iteration %d%n", getName(), getPriority(), i+1);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        }
    }

    public static void main(String[] args) {
        Worker w1 = new Worker("Worker-1", Thread.MIN_PRIORITY);
        Worker w2 = new Worker("Worker-2", Thread.NORM_PRIORITY);
        Worker w3 = new Worker("Worker-3", Thread.MAX_PRIORITY);

        w1.start();
        w2.start();
        w3.start();
    }
}
