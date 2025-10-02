class DiningPhilosophersDeadlock {
    static class Chopstick {}
    static class Philosopher extends Thread {
        private final Chopstick left, right;
        public Philosopher(String name, Chopstick left, Chopstick right) {
            super(name);
            this.left = left; this.right = right;
        }
        public void run() {
            try {
                synchronized (left) {
                    System.out.println(getName()+" picked left");
                    Thread.sleep(50);
                    synchronized (right) {
                        System.out.println(getName()+" picked right and is eating");
                    }
                }
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Chopstick c1 = new Chopstick();
        Chopstick c2 = new Chopstick();

        Philosopher p1 = new Philosopher("Philosopher-1", c1, c2);
        Philosopher p2 = new Philosopher("Philosopher-2", c2, c1); // opposite order -> deadlock possible

        p1.start(); p2.start();
        Thread.sleep(2000);
        System.out.println("If program hangs, deadlock occurred.");
    }
}
