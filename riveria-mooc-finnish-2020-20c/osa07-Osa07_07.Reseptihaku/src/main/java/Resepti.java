import java.util.ArrayList;

public class Resepti {
    private String nimi;
    private int aika;
    private ArrayList<String> aineosat = new ArrayList<>();
    
    public Resepti(String nimi, int aika, ArrayList<String> aineosat) {
        this.nimi = nimi;
        this.aika = aika;
        for(String aineosa : aineosat) {
            this.aineosat.add(aineosa);
        }
    }
    
    public String getNimi(){
        return this.nimi;
    }
    public int getAika(){
        return this.aika;
    }
    public ArrayList<String>getAineosat(){
        return this.aineosat;
    }
    
    public void tulostaAineosat(){
        System.out.println(this.aineosat);
    }   
    @Override
    public String toString(){
        return this.getNimi() + ", keittoaika: " + this.getAika();
    }
   
}