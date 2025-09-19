package eventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento implements Comparable<Evento> {

    /* Attributi */

    private String titolo;

    private LocalDate data;

    private final int numeroPosti;

    private int postiPrenotati;

    /* costruttore */

    public Evento(LocalDate data, int numeroPosti, String titolo) {

        if(data.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("La data non può essere antecedente la data odierna!");
        }else{
            this.data = data;
        }

        if(numeroPosti <= 0){
            throw new IllegalArgumentException("Bisogna specificare il numero di posti disponibili!");
        } else {
              this.numeroPosti = numeroPosti;
        }

        if(titolo.isBlank()){
            throw new IllegalArgumentException("Il titolo inserito non è valido!");
        } else {
            this.titolo = titolo;
        }

        this.postiPrenotati = 0;
    }

    /* Getter */

    public String getTitolo() {
        return this.titolo;
    }

    public LocalDate getData() {
        return this.data;
    }

    public int getNumeroPosti() {
        return this.numeroPosti;
    }

    public int getPostiPrenotati() {
        return this.postiPrenotati;
    }

    /* Setter */

    public void setTitolo(String titolo) {
        if(titolo.isBlank() || titolo == null){
            throw new IllegalArgumentException("Il titolo inserito non è valido!");
        } else {
            this.titolo = titolo;
        }
    }

    public void setData(LocalDate data) {
                if(data.isBefore(LocalDate.now()) || data == null){
            throw new IllegalArgumentException("La data è obbligatoria e non deve essere antecedente la data odierna!");
        }else{
            this.data = data;
        }
    }

    /* Prenota e disdici */

    public void prenota(){
        if(data.isBefore(LocalDate.now()) || this.postiPrenotati == this.numeroPosti){
            throw new IllegalArgumentException("L'evento è passato o abbiamo raggiunto il limite delle prenotazioni");
        } else {
            this.postiPrenotati ++;
        }
    }

    public void prenota (int posti){
        if(posti<0){
            throw new IllegalArgumentException("il numero delle prenotazioni non può essere negativo");
        } else if (data.isBefore(LocalDate.now()) || this.postiPrenotati == this.numeroPosti || this.postiPrenotati + posti > this.numeroPosti){
            throw new IllegalArgumentException("L'evento è passato o abbiamo raggiunto il limite delle prenotazioni");
        } else {
            this.postiPrenotati +=posti;
        }
    }


    public void disdici(){
        if(data.isBefore(LocalDate.now()) || this.postiPrenotati == 0) {
           throw new IllegalArgumentException("L'evento è passato o non ci sono prenotazioni da disdire"); 
        } else {
            this.postiPrenotati --;
        }
    }

    public void disdici (int posti){
        if(posti<0){
            throw new IllegalArgumentException("il numero delle disdette non può essere negativo");
        } else if (data.isBefore(LocalDate.now()) || this.postiPrenotati == 0 || this.postiPrenotati - posti < this.numeroPosti){
            throw new IllegalArgumentException("L'evento è passato o non ci sono più prenotazioni da disdire");
        } else {
            this.postiPrenotati -=posti;
        }
    }

    public void postiDisponibili(){
        System.out.println("I posti disponibili sono: " + (this.numeroPosti - this.postiPrenotati) + ", quelli prenotati: " + this.postiPrenotati);
    }


    /* To String */

    @Override
    public String toString() {
        DateTimeFormatter dataFormattata = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(dataFormattata) + " - " + this.titolo;

    }

    @Override
    public int compareTo(Evento o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
} 
