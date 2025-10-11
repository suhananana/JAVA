class BankAccountBlock {
    private int balance = 1000;

    public void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " preparing to deposit...");

        synchronized (this) {
            int newBalance = balance + amount;
            System.out.println(Thread.currentThread().getName() + " depositing " + amount);
            balance = newBalance;
            System.out.println("Updated Balance: " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class SyncExa {
    public static void main(String[] args) {
        BankAccountBlock account = new BankAccountBlock();

        Thread t1 = new Thread(() -> account.deposit(400), "Thread 1");
        Thread t2 = new Thread(() -> account.deposit(600), "Thread 2");

        t1.start();
        t2.start();
    }
}
