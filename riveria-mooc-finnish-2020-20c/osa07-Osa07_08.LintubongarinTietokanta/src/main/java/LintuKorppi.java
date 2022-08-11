import java.util.ArrayList;

public class LintuKorppi {
    private ArrayList<Lintu> lintuBongari;
    private Lintu lintu;
    
    public LintuKorppi(){
        this.lintuBongari = new ArrayList<>();
    }
    
    public void uusLintu(String nimi, String latinaNimi){
        lintu = new Lintu(nimi, latinaNimi);
        this.lintuBongari.add(lintu);          
    }
    public ArrayList<Lintu> getLinnut(){
        return this.lintuBongari;
    }
    
    public void naytaKaikki(){
        for(Lintu lintu : lintuBongari){
            System.out.println(lintu);
        }
    }
}