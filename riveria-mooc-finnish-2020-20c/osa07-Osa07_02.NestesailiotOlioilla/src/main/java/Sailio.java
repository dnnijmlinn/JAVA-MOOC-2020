public class Sailio {

    private int eka;

    public int sisalto(){
        return eka;

    }

    public void lisaa(int maara){
        if(this.eka <= 100){
            if(maara>0){
                this.eka = this.eka + maara;
                if(this.eka>100){
                    this.eka=100;
                }
            }
        }else {
            this.eka=100;
        }
    }

    public void poista(int maara) {
        if (maara > 0) {
            eka -= maara;
            if (eka < 0) {
                eka = 0;
            }
        }
    }

    public String toString(){
        return this.eka + "/100";

    }
}
