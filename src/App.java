import eventi.Evento;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Evento e1 = new Evento(LocalDate.of(2020, 12, 25), 120, "Iron Maiden");
        Evento e2 = new Evento(LocalDate.of(2026, 2, 9), 200, "Pearljam");
        Evento e3 = new Evento(LocalDate.of(2028,10,19), 500, "Lady Gaga");
       
        System.err.println("Stampe degli eventi: \n");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("\n Stampa dei getter: \n");
        System.out.println("Numero posti dell'evento: "+ e2.getNumeroPosti());
        System.out.println("Data dell'evento: "+ e1.getData());
        e3.setTitolo("The Rasmus");

        System.out.println(e3);


    }

}
