import java.util.ArrayList;

public class Pakka {

    private ArrayList<String> pakka;

    public Pakka(){
        this.pakka = new ArrayList<>();
    }

    public boolean onTyhja(){
        return this.pakka.isEmpty();
    }

    public void lisaa(String arvo){
        this.pakka.add(arvo);
    }

    public ArrayList<String> arvot(){
        return pakka;
    }
    public String ota(){
        String otapois = pakka.get(pakka.size()-1);
        this.pakka.remove(otapois);
        return otapois;

    }
}
