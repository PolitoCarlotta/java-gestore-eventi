package eventi;

import java.time.LocalDate;

public class Evento implements Comparable<Evento> {

    private String titolo;

    private LocalDate data;

    private int numeroPosti;

    private int postiPrenotati;

    public Evento(LocalDate data, int numeroPosti, String titolo) {
        this.data = data;
        this.numeroPosti = numeroPosti;
        this.titolo = titolo;
        this.postiPrenotati = 0;
    }

    public String getTitolo() {
        return titolo;
    }

    public LocalDate getData() {
        return data;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public int getPostiPrenotati() {
        return postiPrenotati;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setData(LocalDate data) {
        this.data = data;
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
