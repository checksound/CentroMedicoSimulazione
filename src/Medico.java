import java.util.concurrent.BlockingQueue;

public class Medico extends Thread
{
    private BlockingQueue<Paziente> salaAspetto;
    public Medico(String name, BlockingQueue<Paziente> salaAspetto) {
        super(name);
        this.salaAspetto = salaAspetto;
    }

    private void doPausa() throws InterruptedException {
        System.out.println("Medico: " + getName() + ", INIZIA LA PAUSA");
        Thread.sleep(2*1000);
        System.out.println("Medico: " + getName() + ", FINISCE LA PAUSA");
    }

    public void run() {
        while(true) {
            try {
                if(salaAspetto.isEmpty()) {
                    // vai a prendere il caffè
                    doPausa();
                }
                Paziente paziente = salaAspetto.take();
                System.out.println("Medico: " + getName() + " inizia visita paziente: " +
                        paziente.getName());

                paziente.startVisiting();
                Thread.sleep(1000);
                paziente.setFinished();
                System.out.println("Medico: " + getName() + " FINITA visita paziente: " +
                        paziente.getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

}
