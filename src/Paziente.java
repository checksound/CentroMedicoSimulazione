import java.util.concurrent.BlockingQueue;

public class Paziente extends Thread {
    private BlockingQueue<Paziente> salaAspetto;
    private boolean visiting = false;

    public Paziente(String name, BlockingQueue<Paziente> salaAspetto) {
        super(name);
        this.salaAspetto = salaAspetto;
    }

    public synchronized void startVisiting() {
        visiting = true;
    }
    private synchronized void waitFinished() throws InterruptedException {
        while(visiting){
            wait();
        }

    }

    public synchronized void setFinished() {
        visiting = false;
        notify();
    }

    public void run() {
        while(true) {
            try {
                salaAspetto.put(this);
                System.out.println("Paziente " + getName() + " entrato in sala aspetto");

                waitFinished();

                Thread.sleep(10 * 1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
