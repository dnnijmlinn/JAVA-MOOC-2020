

public class Urheilu {
    private String kotijoukkeen;
    private String vierasjoukkueen;
    private int kotijoukkueenpisteet;
    private int vierasjoukkueenpisteet;

    public Urheilu(String kotijoukkeen, String vierasjoukkueen, int kotijoukkueenpisteet, int vierasjoukkueenpisteet) {
        this.kotijoukkeen = kotijoukkeen;
        this.vierasjoukkueen = vierasjoukkueen;
        this.kotijoukkueenpisteet = kotijoukkueenpisteet;
        this.vierasjoukkueenpisteet = vierasjoukkueenpisteet;
    }

    public String getkotijoukkeen() {
        return kotijoukkeen;
    }
    public String getvierasjoukkueen() {
        return vierasjoukkueen;
    }
    public int getkotijoukkueenpisteet() {
        return kotijoukkueenpisteet;
    }
    public int getvierasjoukkueenpisteet() {
        return vierasjoukkueenpisteet;
    }

        @Override
    public String toString() {
        return this.kotijoukkeen +" "+ this.vierasjoukkueen +" "+this.kotijoukkueenpisteet +" "+this.vierasjoukkueenpisteet;
    }
}
