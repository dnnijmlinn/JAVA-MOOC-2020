public class kirja {

    private String nimi;
    private int sivuja;
    private int vuosi;

    public kirja(String nimi, int sivuja, int vuosi) {
        this.nimi = nimi;
        this.sivuja = sivuja;
        this.vuosi = vuosi;
    }
    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return this.nimi + ", " + this.sivuja + " sivua, " + this.vuosi;
    }
}
