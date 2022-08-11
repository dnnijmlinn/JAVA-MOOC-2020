
public class Laskuri {
    private int alkuarvo;

    public Laskuri(int alkuarvo){
        this.alkuarvo=alkuarvo;

    }
    
    public Laskuri(){
    this(0);

    }

    public int arvo(){
        return alkuarvo;

    }
    public void lisaa(){
        this.alkuarvo=this.alkuarvo+1;
    }

    public void lisaa(int lisays){
        if(lisays>=0){
            this.alkuarvo=this.alkuarvo+lisays;
           }
            if(lisays<0){
                this.alkuarvo=this.alkuarvo;
            }

    }
    public void vahenna(){
        this.alkuarvo=this.alkuarvo-1;

    }

    public void vahenna(int vahennys){
       if(vahennys>=0){
        this.alkuarvo=this.alkuarvo-vahennys;
       }
        if(vahennys<0){
            this.alkuarvo=this.alkuarvo;
        }
    }
}
