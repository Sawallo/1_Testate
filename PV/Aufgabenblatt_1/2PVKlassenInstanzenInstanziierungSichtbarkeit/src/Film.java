public class Film {

    //Variablen
    private String titel;
    private long dauer;


    //Methoden
    //getter
    /* 
    public String getTitel(){
        return titel;
    }
    public long getDauer() {
        return dauer;
    }
        */
    //setter
    public void setTitel(String titel) {
        this.titel = titel;
    }
    public void setDauer(long dauer) {
        this.dauer = dauer;
    }
        


    public static void main(String[] args) throws Exception {
        
        Film Abenteuer = new Film();
        Abenteuer.setTitel("Baumkampf");
        Abenteuer.setDauer(120);


        System.out.println(Abenteuer.titel);
        System.out.println(Abenteuer.dauer);
    }
}
