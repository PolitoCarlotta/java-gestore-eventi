import eventi.Concerto;
import java.time.LocalDate;
import java.time.LocalTime;

public class UsaConcerto {

    public static void main(String[] args) {

        Concerto c1 = new Concerto(LocalDate.of(2026, 12, 20), 20, "fila", LocalTime.of(20, 11), 25.00);

        System.out.println("La data e l'ora del concerto formattato sono: "+ c1.getDataOraFormattata());
        System.out.println("Il prezzo formattato è di: " + c1.getPrezzoFormattato());

    }

}
