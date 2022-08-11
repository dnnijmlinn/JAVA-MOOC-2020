import java.util.ArrayList;

public class Pakkaus {

    private ArrayList<Lahja> lahjat;

    public Pakkaus() {
        this.lahjat = new ArrayList<>();
    }

    public void lisaaLahja(Lahja lahja){
        this.lahjat.add(lahja);

    }

    public int yhteispaino(){
        int yhteispaino = 0;
        if(this.lahjat.isEmpty()){
            return -1;
        } else {
            for (Lahja lahja : lahjat) {
                yhteispaino += lahja.getPaino();
            }
            return yhteispaino;

        }
    }
}
