package core;
class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    // Synchronized method to ensure only one thread can withdraw at a time
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing: " + amount);
            balance -= amount;

            // Simulate delay
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " but insufficient balance.");
        }
    }

    public int getBalance() {
        return balance;
    }
}

// Thread class
class Customer extends Thread {
    private BankAccount account;
    private int amount;

    public Customer(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

   
    public void run() {
        account.withdraw(amount);
    }
}

public class ThreadSynchronizationDemo {
	public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount(500);

        // Create multiple threads sharing the same account
        Customer c1 = new Customer(sharedAccount, 300);
        Customer c2 = new Customer(sharedAccount, 300);

        c1.setName("Customer-1");
        c2.setName("Customer-2");

        // Start threads
        c1.start();
        c2.start();
    }
}

