package BlockingQueue;

import BlockingQueue.Consumerr.Consumerr;
import BlockingQueue.Producer.Producer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueMain {
    public static void main(String[] args) throws Exception{
        /*
        Java blocking queue is a queue whihc enque elements from end and deque element from begining
        End <-[]-[]-[]-[]-[] -> begining
               BlockingQueue

        The difference between a notmal queue and a blocking queue is ki we can block the therds which
        are inserting and deleting elements at whim
        Like here in our example when queue is full we can block thread whihc wants to enque something
        untill there is some created in the queue

        BlockingQueue is an interface so we cannot directly create an instance of it, but we can create
        the instance of a class which is implementing it.

        toh yaha we have ArrayBlockingQueue and LinkedBlockingQueue to implementing BlockingQueue
         */


        BlockingQueue queue = new ArrayBlockingQueue(1024);

        Producer producer = new Producer(queue);
        Consumerr consumer = new Consumerr(queue);

        new Thread(producer).start();
        new Thread(consumer).start();

        Thread.sleep(4000);
    }
}
