import java.util.ArrayList;

public class Matkalaukku {

    private ArrayList<Tavara> tavarat ;
    private int maxPaino;

    public Matkalaukku(int maxPaino){
        this.maxPaino=maxPaino;
        this.tavarat = new ArrayList<>();
    }
    
    public void lisaaTavara(Tavara tavara){
        int matkalaukkuPaino = 0;
        for(Tavara i : tavarat){
            matkalaukkuPaino += i.getPaino();
        }
        if(!(matkalaukkuPaino+tavara.getPaino()>maxPaino)){
            tavarat.add(tavara);
        }
    }

    public String toString(){
        int matkalaukkuPaino = 0;
        for(Tavara i : tavarat){
            matkalaukkuPaino += i.getPaino();
        }
        if(tavarat.isEmpty()){
            return "ei tavaroita (0 kg)";
        }
        if(tavarat.size()==1){
            return tavarat.size() + " tavara (" + matkalaukkuPaino + " kg)";
        } else{
            return tavarat.size() + " tavaraa (" + matkalaukkuPaino + " kg)";

        }
    }

    public void tulostaTavarat() {
        for(Tavara tavara : tavarat){
            System.out.println(tavara.toString());
        }
    }

    public int yhteispaino(){
        int yhteispaino =0;
        for(Tavara tavara:tavarat){
            yhteispaino += tavara.getPaino();
        }
        return yhteispaino;
    }

    public Tavara raskainTavara() {
        if (this.tavarat.isEmpty()){
            return null;
        }
        Tavara raskainTavara = this.tavarat.get(0);
        for (Tavara tavarat : tavarat){
            if (raskainTavara.getPaino() < tavarat.getPaino()) {
                raskainTavara = tavarat;
            }
        }
        return raskainTavara;
    }

}
