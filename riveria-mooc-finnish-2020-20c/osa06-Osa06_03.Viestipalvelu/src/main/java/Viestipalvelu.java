import java.util.ArrayList;

public class Viestipalvelu {

    private ArrayList<Viesti> viestit;

    public Viestipalvelu(){
        this.viestit = new ArrayList<>();
    }

    public void lisaa(Viesti viesti){
        if(viesti.getSisalto().length()<=280){
            this.viestit.add(viesti);
        }
    }
    public ArrayList<Viesti> getViestit(){
        return this.viestit;
    }
}
