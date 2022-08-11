
public class Mittari {
    private int mitta;
    
    
    
    public void lisaa() {
        if(mitta<5){
            mitta++;
        }
    }
    
    public void vahenna(){
        if(mitta!=0){
            mitta--;
        }

    }
    public int mitta(){
        return mitta;
    }
    public boolean taynna() {
        if (mitta==5){
            return true;
        }else{
            return false;
        }
    }
}
