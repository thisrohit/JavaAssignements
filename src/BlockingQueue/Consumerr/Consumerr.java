package BlockingQueue.Consumerr;

import java.util.concurrent.BlockingQueue;

public class Consumerr implements Runnable {
    protected BlockingQueue queue = null;

    public Consumerr(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
