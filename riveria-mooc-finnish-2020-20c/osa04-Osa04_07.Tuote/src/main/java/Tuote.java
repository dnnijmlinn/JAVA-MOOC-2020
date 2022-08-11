
public class Tuote {
    private String banani;
    private double hinta;
    private int kpl;
 
    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa){
        this.banani = nimiAlussa;
        this.hinta = hintaAlussa;
        this.kpl = maaraAlussa;
    }
    public void tulostaTuote(){
        System.out.println(this.banani + ", " + "hinta " + this.hinta  + ", " +  this.kpl + "kpl");

    }
    
}
