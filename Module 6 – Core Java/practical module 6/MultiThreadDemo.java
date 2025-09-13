package core;
class ThreadOne extends Thread {
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("ThreadOne: " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("ThreadOne interrupted");
            }
        }
    }
}

// Thread 2
class ThreadTwo extends Thread {
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("ThreadTwo: " + i);
            try {
                Thread.sleep(700); // Pause for 0.7 seconds
            } catch (InterruptedException e) {
                System.out.println("ThreadTwo interrupted");
            }
        }
    }
}

public class MultiThreadDemo {
	public static void main(String[] args) {
        // Create thread objects
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        // Start the threads
        t1.start();
        t2.start();

        System.out.println("Main thread is running...");
    }
}

