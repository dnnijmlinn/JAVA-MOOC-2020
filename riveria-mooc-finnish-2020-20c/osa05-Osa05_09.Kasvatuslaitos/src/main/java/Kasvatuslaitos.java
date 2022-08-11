
public class Kasvatuslaitos {
    private int punnitukset;

    public Kasvatuslaitos(){
        this.punnitukset=0;
    }

    public int punnitse(Henkilo henkilo) {
        // palautetaan parametrina annetun henkilön paino
        this.punnitukset++;
        return henkilo.getPaino();
    }

    public void syota(Henkilo henkilo) {
        henkilo.setPaino(henkilo.getPaino()+1);

    }

    public int punnitukset() {
        
        return this.punnitukset;
    }

}
