package eventi;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Concerto extends Evento{

    /* Attributi */

    private LocalTime ora;

    private Double prezzo;




    /* Costruttore */

    public Concerto(LocalDate data, int numeroPosti, String titolo, LocalTime ora, Double prezzo) {
        super(data, numeroPosti, titolo);
        this.ora = ora;
        this.prezzo = prezzo;
    }

    /* Getter e setter */

    public LocalTime getOra() {
        return ora;
    }

    public void setOra(LocalTime ora) {
        if(ora == null ){
            throw new IllegalArgumentException("L'ora inserita non è valida");
        }else {
            this.ora = ora;
        }

    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        if(prezzo == null || prezzo <0){
            throw new IllegalArgumentException("Il prezzo inserito non è valido!");
        } else {
            this.prezzo = prezzo;
        }
    }

    /* date e prezzi formattati */

    public String getDataOraFormattata(){
        LocalDateTime dataOra = LocalDateTime.of(super.getData(), this.ora);
        DateTimeFormatter dataOraFromattata = DateTimeFormatter.ofPattern("dd/MM/yyyy,' alle 'HH:mm");
        return dataOraFromattata.format(dataOra);
    }

    public String getPrezzoFormattato(){
        NumberFormat prezzoFormattato = NumberFormat.getCurrencyInstance(Locale.ITALY);
        return prezzoFormattato.format(this.prezzo);
    }

    @Override
    public String toString() {
        return getDataOraFormattata() + " - " + getTitolo()
                + " - " + getPrezzoFormattato();
    }

    

    

    

}
