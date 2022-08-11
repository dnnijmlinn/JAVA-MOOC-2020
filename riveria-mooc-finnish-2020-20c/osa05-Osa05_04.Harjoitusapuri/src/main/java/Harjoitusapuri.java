

public class Harjoitusapuri {
    private int ika;
    private int leposyke;


    public Harjoitusapuri(int ika, int leposyke){
        this.ika = ika;
        this.leposyke = leposyke;


    }

    public double tavoitesyke(double prosenttiaMaksimista){

        return ((206.3 - (0.711 * this.ika) - this.leposyke) * (prosenttiaMaksimista)) + this.leposyke;

    }

    
}
