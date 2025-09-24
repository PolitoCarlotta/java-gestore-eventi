package eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgrammaEventi {

    /* Attributi */

    private String titolo;

    private final List<Evento> eventi;


    /* Costruttore */

    public ProgrammaEventi(String titolo){
        if(titolo == null || titolo.isBlank()){
            throw new IllegalArgumentException("Il titolo inserito non è valido");
        } else {
            this.titolo = titolo;
        }
            
        this.eventi = new ArrayList<>();
    }

    /* Aggiungere eventi */

    public void aggiungiEvento(Evento e){
        if(e ==null){
            throw new IllegalArgumentException("l'evento inserito non è valido");
        }       
        eventi.add(e);
    }

    /* lista eventi presenti in una data */

        public List<Evento> getEventoByData(LocalDate dataEvento){
        if(dataEvento == null){
            throw new IllegalArgumentException("La data inserita non è valida");
        }
        
        List<Evento> result = new ArrayList<>();
        for (Evento e : this.eventi) {
            if(e.getData().equals(dataEvento)){
                result.add(e);
            }
        }
        return Collections.unmodifiableList(result);
    }

    /* quanti eventi sono presenti nel programma */

    public int getNumeroEventi(){
        return this.eventi.size();
    }

    /* svuotare la lista */
    public void svuotaEventi(){
        eventi.clear();
    }

    /* restituire una stringa con titolo del programma e tutti gli eventi ordinati -data1 -titolo1 */
    public String getEventiOrdinati(){
        List<Evento> eventiOrdinati = new ArrayList<>(this.eventi);
        Collections.sort(eventiOrdinati);

        StringBuilder frase = new StringBuilder();

        frase.append("Programma: ").append(this.titolo).append("\n");

        for(Evento e : eventiOrdinati){
            frase.append(e.toString()).append("\n");
        }
        return frase.toString();
    }

}
