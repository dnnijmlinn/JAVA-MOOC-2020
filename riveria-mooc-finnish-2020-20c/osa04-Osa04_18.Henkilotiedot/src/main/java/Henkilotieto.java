
public class Henkilotieto {

    private String etunimi;
    private String sukunimi;
    private String hetu;

    public Henkilotieto(String etunimi, String sukunimi, String hetu) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.hetu = hetu;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public String getHetu() {
        return hetu;
    }

    @Override
    public String toString() {
        return this.sukunimi + ", " + this.etunimi + " (" + this.hetu + ")";
    }
}
