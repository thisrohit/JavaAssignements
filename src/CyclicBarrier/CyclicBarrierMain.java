package CyclicBarrier;

import CyclicBarrier.PassengerThread.PassengerThread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierMain {

    /*
    CB is another type of concurrency mech, where multiple thread or parties wait for each other at
    a common point also known as barrier before starting to process again

    here we are considering a cab service which will provide cab only once 4 passenger are avaibalbe
     */
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        System.out.println(Thread.currentThread().getName() + "has started ");

//        here 4 means no, of parties to start
        CyclicBarrier cb = new CyclicBarrier(4);

        PassengerThread p1 = new PassengerThread(1000, cb, "Rohit");
        PassengerThread p2 = new PassengerThread(2000, cb, "Rahul");
        PassengerThread p3 = new PassengerThread(3000, cb, "Preeti");
        PassengerThread p4 = new PassengerThread(4500, cb, "Jiya");

        PassengerThread p5 = new PassengerThread(1000, cb, "Suraj");
        PassengerThread p6 = new PassengerThread(2000, cb, "Pushpendra");
        PassengerThread p7 = new PassengerThread(3000, cb, "Aman");
        PassengerThread p8 = new PassengerThread(4500, cb, "Rohit");

        p1.start();
        p2.start();
        p3.start();
        p4.start();


        p5.start();
        p6.start();
        p7.start();
        p8.start();

        System.out.println(Thread.currentThread().getName() + "has completed the trip");
    }
//difference from COuntDownLatch -
//    CDL is not reusable whereas CyclicBarrier is reusable



}
