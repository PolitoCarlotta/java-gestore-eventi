import eventi.Concerto;
import eventi.Evento;
import java.time.LocalDate;
import java.time.LocalTime;

public class UsaConcerto {

    public static void main(String[] args) {

        /* Creare concerti */
        Concerto c1 = new Concerto(LocalDate.of(2026, 12, 20), 20, "fila", LocalTime.of(20, 11), 25.00);

        Evento c2 = new Concerto(LocalDate.of(2028, 6, 14), 560, "jam Session", LocalTime.of(21,31), 45.99);

        /* metodi set e get */
        System.out.println("La data e l'ora del concerto formattato sono: "+ c1.getDataOraFormattata());
        System.out.println("Il prezzo formattato è di: " + c1.getPrezzoFormattato());
        System.out.println("");

        System.out.println(c1);
        System.out.println(c1.getNumeroPosti());
        c1.setTitolo("Bon Jovi");
        System.out.println(c1);


        System.out.println(c2);
        System.out.println("");

        /* metodi prenota e disdici */
        c1.prenota();
        System.out.println(c1.postiDisponibili());
        c1.prenota(15);
        System.out.println(c1.postiDisponibili());
        c1.disdici();
        System.out.println(c1.postiDisponibili());
        c1.disdici(6);
        System.out.println(c1.postiDisponibili());
    }

}
