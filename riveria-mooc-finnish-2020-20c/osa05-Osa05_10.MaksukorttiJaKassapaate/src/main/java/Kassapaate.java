
public class Kassapaate {

    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä

    public Kassapaate() {
        this.rahaa=1000;
        this.edulliset=0;
        this.maukkaat=0;
    }

    public double syoEdullisesti(double maksu) {
        double lounas = 2.5;
        if(maksu<lounas){
            return maksu;
        } else {
            maksu-=lounas;
            this.rahaa+=lounas;
            this.edulliset++;
        }
        return maksu;
    }

    public double syoMaukkaasti(double maksu) {
        double lounas = 4.3;
        if(maksu<lounas){
            return maksu;
        } else {
            maksu-=lounas;
            this.rahaa+=lounas;
            this.maukkaat++;
        }
        return maksu;
    }
    public boolean syoEdullisesti(Maksukortti kortti) {
        double lounas = 2.5;
        if(kortti.saldo()>=lounas){
            this.edulliset++;
        }
        return kortti.otaRahaa(lounas);
    }

    public boolean syoMaukkaasti(Maksukortti kortti) {
        
        double lounas = 4.3;
        if(kortti.saldo()>=lounas){
            this.maukkaat++;
        }
        return kortti.otaRahaa(lounas);
    }

    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if(summa>0){
            kortti.lataaRahaa(summa);
            this.rahaa+=summa;
        }

    }

    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " + edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
