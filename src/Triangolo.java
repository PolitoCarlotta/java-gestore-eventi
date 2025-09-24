public class Triangolo {

    private int numero;

    private int asterischi;

    public Triangolo( int numero){
        this.numero = numero;
        this.asterischi = numero;
    }

    public void stampa(){
        for( int i =0; i< this.numero; i++){
            for(int k = this.asterischi; k > 0; k--){
                System.out.print("*");
            }
            System.out.println("");
            this.asterischi --;
        }
    }
}
