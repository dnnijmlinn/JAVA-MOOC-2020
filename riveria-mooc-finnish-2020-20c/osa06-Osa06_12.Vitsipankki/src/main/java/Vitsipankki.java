import java.util.ArrayList;
import java.util.Random;

public class Vitsipankki {
    private ArrayList<String> vitsit;

    public Vitsipankki() {
        this.vitsit = new ArrayList<>();
    }

    public void lisaaVitsi(String vitsi){
        this.vitsit.add(vitsi);

    }

    public String arvoVitsi(){
        if(this.vitsit.isEmpty()){
            return "Vitsit vähissä";
        } else {
            Random viti = new Random();
            int i = viti.nextInt(vitsit.size());
            return vitsit.get(i);
        }
        
    }

    public void tulostaVitsit(){
        for (String vitsi : vitsit) {
            System.out.println(vitsi);
        }
    }
}
