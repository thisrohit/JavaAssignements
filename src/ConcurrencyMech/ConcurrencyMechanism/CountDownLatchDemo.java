package ConcurrencyMech.ConcurrencyMechanism;

import ConcurrencyMech.ConcurrencyMechanism.DevTeam.DevTeam;
import ConcurrencyMech.ConcurrencyMechanism.QATeam.QATeam;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

    /*
    It is implemented from Java 1.5 onwards
    It workd on latch principle
    here the concept is one thread wait for n no. of thread specified for it execution

    here - lets say there are three thread, A B C and we want ki thread C starts only when A and B have
    completed its operation. toh here we can implement CountDown Latcj

     */
    public static void main(String[] args) throws InterruptedException {
//        here i am creating a countdown latch for 2 thread and uske khtam hone pe hi i want my other thread
//        to execute

//        CountDownLatch is one responsible to take care for this.. bracket mai 2 jo hai
//        it will take care of the countdown i want ya thread i wannt

        CountDownLatch countDownLatch = new CountDownLatch(2);

//        creating two task to complete
        DevTeam devTeam1 = new DevTeam(countDownLatch, "Dev-1");
        DevTeam devTeam2 = new DevTeam(countDownLatch, "Dev-2");

//        starting thread
        devTeam1.start();
        devTeam2.start();

//        once the two threads (dev1 and dev2) are completed tab execute this
        countDownLatch.await();

//        now once the countdown becomes 0. the next thread will get executed


        QATeam qaTeam = new QATeam("QA-Team-1");
        qaTeam.start();

    }
}
