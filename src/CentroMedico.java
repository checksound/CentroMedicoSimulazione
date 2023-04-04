import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CentroMedico {
    public static void main(String[] args) {
        BlockingQueue<Paziente> salaAspetto = new ArrayBlockingQueue<>(4);

        Medico medico1 = new Medico("Medico1", salaAspetto);
        Medico medico2 = new Medico("Medico2", salaAspetto);

        medico1.start();
        medico2.start();

        Paziente[] pazienti = new Paziente[10];
        for(int i = 0; i < 10; i++) {
            pazienti[i] = new Paziente("Paziente" + (i + 1), salaAspetto);
        }

        for(int i = 0; i < 10; i++) {
            pazienti[i].start();
        }
    }

}
