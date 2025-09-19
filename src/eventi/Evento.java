package eventi;

import java.time.LocalDate;

public class Evento implements Comparable<Evento> {

    private String titolo;

    private LocalDate data;

    private int numeroPosti;

    private int postiPrenotati;

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

    @Override
    public int compareTo(Evento o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Evento{");
        sb.append("titolo=").append(titolo);
        sb.append(", data=").append(data);
        sb.append(", numeroPosti=").append(numeroPosti);
        sb.append(", postiPrenotati=").append(postiPrenotati);
        sb.append('}');
        return sb.toString();
    }

    
    

} 
