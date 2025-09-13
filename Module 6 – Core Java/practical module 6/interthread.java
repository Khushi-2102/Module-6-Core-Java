package core;
class MessageQueue {
    private String message;
    private boolean hasMessage = false;

    public synchronized void put(String msg) {
        // Wait until the queue is empty
        while (hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer interrupted.");
            }
        }
        this.message = msg;
        this.hasMessage = true;
        System.out.println("Producer puts: " + msg);
        // Notify waiting threads that a message is available
        notifyAll();
    }

    public synchronized String get() {
        // Wait until a message is available
        while (!hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted.");
            }
        }
        String receivedMessage = this.message;
        this.hasMessage = false;
        System.out.println("Consumer gets: " + receivedMessage);
        // Notify waiting threads that the queue is now empty
        notifyAll();
        return receivedMessage;
    }
}

class Producer extends Thread {
    private MessageQueue queue;

    Producer(MessageQueue queue) {
        this.queue = queue;
    }

    public void run() {
        String[] messages = {"Hello", "World", "Java", "Threads", "End"};
        for (String msg : messages) {
            queue.put(msg);
            try {
                Thread.sleep(1000); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private MessageQueue queue;

    Consumer(MessageQueue queue) {
        this.queue = queue;
    }

    public void run() {
        String msg;
        do {
            msg = queue.get();
        } while (!msg.equals("End"));
    }
}
    
public class interthread {
	public static void main(String[] args) {
        MessageQueue queue = new MessageQueue();
        new Producer(queue).start();
        new Consumer(queue).start();
    
}

}
