package CyclicBarrier.PassengerThread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class PassengerThread extends Thread {

    private CyclicBarrier barrier;
    private int duration;


    public PassengerThread(int duration, CyclicBarrier barrier, String name){
        super(name);
        this.duration = duration;
        this.barrier = barrier;
    }

    public void run(){
        try {
            Thread.sleep(duration);
            System.out.println("Your Passenger " + Thread.currentThread().getName() + "has arrived");

//            here when one passenger reach then await will be decremented by 1 and so on untill all
//            4 passenger arrives when await becomes 0 and then cab starts.
            int await = barrier.await();
            if(await == 0){
                System.out.println("All Passengers have arrived, start CAB");
            }
        }catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }



}
