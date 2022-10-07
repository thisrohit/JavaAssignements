package ConcurrencyMech.ConcurrencyMechanism.DevTeam;

import java.util.concurrent.CountDownLatch;

public class DevTeam extends Thread {
    private CountDownLatch countDownLatch;

    public DevTeam(CountDownLatch countDownLatch, String name){
        super(name);
        this.countDownLatch = countDownLatch;
    }

    public void run(){
        System.out.println("Task assigned to team named - " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Task finished by - " + Thread.currentThread().getName());

//        once done call the countdown method upon completion of task
        countDownLatch.countDown();

    }



}
