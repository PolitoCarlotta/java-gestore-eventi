import eventi.Evento;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class testEvento {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        /* Inserire dati nuovo evento */

        System.out.println("Per creare un nuovo evento inserisci: \n");

        System.out.print("Il titolo dell'evento: ");
        String titolo = input.nextLine();

        System.out.print("Il numero dei posti disponibili: ");
        int numeroPosti = input.nextInt();
        input.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("La data dell'evento (in formato gg/mm/aaaa) :");
        String dataInput = input.nextLine();       
        LocalDate data = LocalDate.parse(dataInput, formatter);
        System.out.println(data);

        /* Creare evento */

        Evento eventoUtente = new Evento(data, numeroPosti, titolo);

        System.out.println("l'evento creato è: " + eventoUtente + " con " + eventoUtente.getNumeroPosti() + " posti disponibili");            
       

        /* Inserire prenotazioni */
        System.out.print("\n Vuoi prenotare dei posti?\n Inserisci si o no: ");
        String voglioPrenotare = input.next().toLowerCase();

        if(voglioPrenotare.equals("si")){
            System.out.print("Inserisci quanti posti vuoi prenotare: ");
            int posti = input.nextInt();
            eventoUtente.prenota(posti);                  
            }else if (voglioPrenotare.equals("no")) {
                System.out.println("Grazie lo stesso");      
               } else {
                    System.out.println("L'opzione inserita non è valida!");
               }      
            
            eventoUtente.postiDisponibili();

        /* Togliere disdette */
        System.out.print("\n Vuoi disdire dei posti?\n Inserisci si o no: ");
        String voglioDisdire = input.next().toLowerCase();

        if(voglioDisdire.equals("si")){
            System.out.print("Inserisci quanti posti vuoi disdire: ");
            int posti2 = input.nextInt();
            eventoUtente.disdici(posti2);                
            }else if (voglioDisdire.equals("no")) {
                System.out.println("Hai fatto un'ottima scelta!");      
               } else {
                    System.out.println("L'opzione inserita non è valida!");
               }      
            
            eventoUtente.postiDisponibili();


        


    }

}
