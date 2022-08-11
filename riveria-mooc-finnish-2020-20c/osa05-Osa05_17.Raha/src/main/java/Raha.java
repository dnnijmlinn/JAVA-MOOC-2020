
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }

    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha(this.euroa + lisattava.euroa, this.senttia + lisattava.senttia); // luodaan uusi Raha-olio jolla on oikea arvo
        // palautetaan uusi Raha-olio
        return uusi;
    }

    public boolean vahemman(Raha verrattava){
        if(this.euroa<verrattava.euroa ){
            return true;
        }
        if(this.euroa==verrattava.euroa){
            if(this.senttia<verrattava.senttia ){
                return true;
            } 
        }
        return false;

    }

    public Raha miinus(Raha vahentaja) {
        Raha uusiraha;
        int lopullinenraha = (this.euroa*100 + this.senttia ) - (vahentaja.euroa*100 + vahentaja.senttia);
        if(lopullinenraha<=0){
            uusiraha = new Raha(0,0);
        } else {
            uusiraha = new Raha(0, lopullinenraha);
        }
        
        return uusiraha;
    }
    

}
