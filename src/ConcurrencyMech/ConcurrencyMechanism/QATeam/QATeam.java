package ConcurrencyMech.ConcurrencyMechanism.QATeam;

public class QATeam extends Thread {

    public QATeam(String name){
        super(name);
    }

    public void run(){
        System.out.println("Task assigned to " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task completed by +" + Thread.currentThread().getName());
    }


}
