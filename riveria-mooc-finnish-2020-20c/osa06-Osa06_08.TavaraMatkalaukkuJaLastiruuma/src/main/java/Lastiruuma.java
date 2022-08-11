import java.util.ArrayList;

public class Lastiruuma {
    private int max;
    private ArrayList<Matkalaukku> lastiruuma = new ArrayList<Matkalaukku>();

    public Lastiruuma (int max) {
        this.max=max;
    }
    
    public void lisaaMatkalaukku(Matkalaukku laukku) {
        int laukut = 0;
        for (Matkalaukku yksLaukku : lastiruuma) {
            laukut += yksLaukku.yhteispaino();
        }
        if (laukut + laukku.yhteispaino() <= max) {
            lastiruuma.add(laukku);
        }
    }

    public String toString() {
        int yhteisPaino = 0;
        for (Matkalaukku yksLaukku : lastiruuma) {
            yhteisPaino += yksLaukku.yhteispaino();
        }
        return lastiruuma.size() + " matkalaukkua (" + yhteisPaino +  " kg)";
    }
    public void tulostaTavarat(){
        for(Matkalaukku matkalaukku : lastiruuma){
            matkalaukku.tulostaTavarat();
        }
    }
}
