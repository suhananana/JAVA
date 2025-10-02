class ReverseRunnable implements Runnable {
    private final String s;

    public ReverseRunnable(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
            try { Thread.sleep(200);
            } catch (InterruptedException ignored) {}
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Thread t = new Thread(new ReverseRunnable("MULTITHREADING"));
        t.start();
    }
}
