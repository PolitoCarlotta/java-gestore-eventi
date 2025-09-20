import eventi.Concerto;
import eventi.ProgrammaEventi;
import java.time.LocalDate;
import java.time.LocalTime;

public class provaProgramma {
    public static void main(String[] args) {

        /* Creazione eventi */
        Concerto c1 = new Concerto(LocalDate.of(2026, 10, 24), 255, "Planet Funk", LocalTime.of(21, 12), 40.00);

        Concerto c2 = new Concerto(LocalDate.of(2026, 10, 24), 400, "Linkin Park", LocalTime.of(17, 25), 83.00);

        Concerto c3 = new Concerto(LocalDate.of(2026, 6, 2), 55, "Pooh", LocalTime.of(11, 15), 10.00);

        Concerto c4 = new Concerto(LocalDate.of(2027, 02, 22), 650, "Muse", LocalTime.of(20, 55), 90.00);
        
        /* Creazione programma eventi */
        ProgrammaEventi eventi = new ProgrammaEventi("Prossimi Concerti");

        /* aggiunta eventi al programma */
        eventi.aggiungiEvento(c4);
        eventi.aggiungiEvento(c2);
        eventi.aggiungiEvento(c1);
        eventi.aggiungiEvento(c3);

        /* stampa dei metodi */
        System.out.println("Eventi ordinati per data: \n" + eventi.getEventiOrdinati());
        
        System.out.println("Eventi alla data richiesta: \n" + eventi.getEventoByData(LocalDate.of(2026, 10, 24)));
        System.out.println("");
        System.out.println("Numero di eventi nel programma: " +eventi.getNumeroEventi());

        eventi.svuotaEventi();

        System.out.println("Numero di eventi nel programma: " + eventi.getNumeroEventi());
    }
}
