
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    
    public boolean suurempi(Asunto verrattava){
        
        return this.nelioita>verrattava.nelioita;
    }

    public int hintaero(Asunto verrattava) {
        int ero =(this.nelioita*this.neliohinta)-(verrattava.nelioita*verrattava.neliohinta);
        if(ero<0){
            ero = ero *(-1);
        }
        return ero;
    }

    public boolean kalliimpi(Asunto verrattava){
        int yk = this.nelioita*this.neliohinta;
        int kak = verrattava.nelioita*verrattava.neliohinta;
        return yk>kak;

    }

}
