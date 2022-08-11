public class Tehtava {

    private String nimi;
    private boolean tehty;

    public Tehtava(String nimi) {
        this.nimi = nimi;
        this.tehty = false;
    }

    public String getNimi() {
        return nimi;
    }

    public void setTehty(boolean tehty) {
        this.tehty = tehty;
    }

    public boolean onTehty() {
        return tehty;
    }
}
