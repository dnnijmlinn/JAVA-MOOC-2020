import java.util.ArrayList;

public class Huone {

    private ArrayList<Henkilo> henkilot;

    public Huone() {
        this.henkilot = new ArrayList<>();
    }

    public void lisaa(Henkilo henliko) {
        this.henkilot.add(henliko);
    }

    public boolean onTyhja() {
        return this.henkilot.isEmpty();
    }

    public ArrayList<Henkilo> getHenkilot() {
        return this.henkilot;
    }

    public Henkilo lyhin() {
        if (this.henkilot.isEmpty()) {
            return null;
        }
        Henkilo lyhinHenkilo = this.henkilot.get(0);
        for (Henkilo henliko : henkilot) {
            if (lyhinHenkilo.getPituus() > henliko.getPituus()) {
                lyhinHenkilo = henliko;
            }
        }
        return lyhinHenkilo;
    }

    public Henkilo ota() {
        Henkilo lyhinHenkilo = this.lyhin();
        this.henkilot.remove(lyhinHenkilo);
        return lyhinHenkilo;
    }
}