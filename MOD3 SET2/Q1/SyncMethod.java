class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        int newBalance = balance + amount;
        System.out.println(Thread.currentThread().getName() + " depositing " + amount);
        balance = newBalance;
        System.out.println("Updated Balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

public class SyncMethod {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.deposit(500), "Thread 1");
        Thread t2 = new Thread(() -> account.deposit(300), "Thread 2");

        t1.start();
        t2.start();
    }
}
