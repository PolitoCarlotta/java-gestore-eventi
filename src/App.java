import eventi.Evento;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Evento e1 = new Evento(LocalDate.of(2020, 12, 25), 120, "concerto");

       System.out.println(e1);
    }

}
