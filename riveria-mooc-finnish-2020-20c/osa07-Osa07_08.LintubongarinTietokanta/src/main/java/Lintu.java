public class Lintu {
    private String nimi;
    private String latinaNimi;
    private int kerrat;
    
    public Lintu(String nimi, String latinaNimi){
        this.nimi = nimi;
        this.latinaNimi = latinaNimi;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    public String getLatinaNimi(){
        return this.latinaNimi;
    }
    public void increaseKerrat(){
        this.kerrat++;
    }
    

    public String toString(){
        return this.nimi + "(" + this.latinaNimi + "): " + this.kerrat + " havaintoa";
    }
}
