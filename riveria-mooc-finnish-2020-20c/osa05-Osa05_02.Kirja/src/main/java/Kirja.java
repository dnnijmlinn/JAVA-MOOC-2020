

public class Kirja {
    private String kirjailija;
    private String nimi;
    private int sivuja;


    public Kirja(String kirjailija, String nimi, int sivuja){
        this.kirjailija = kirjailija;
        this.nimi = nimi;
        this.sivuja = sivuja;

    }

    public String getKirjailija(){
        return kirjailija;
    }
    public String getNimi(){
        return nimi;
    }
    public int getSivuja(){
        return sivuja;
    }
    public String toString(){
        return kirjailija + ", " + nimi + ", " + sivuja + " sivua";
    }
}
