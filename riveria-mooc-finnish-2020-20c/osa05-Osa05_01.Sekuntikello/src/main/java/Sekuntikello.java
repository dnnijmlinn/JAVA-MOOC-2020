
public class Sekuntikello {

    private Viisari sadasosaa;
    private Viisari sec;

    public Sekuntikello() {
        this.sadasosaa = new Viisari(100);
        this.sec = new Viisari(60);
    }
    public void etene(){
        this.sadasosaa.etene();
        if(this.sadasosaa.arvo()==0) {
            this.sec.etene();           
        }
    }
    public String toString() {
        return this.sec+":"+this.sadasosaa;
    }
    
    
}