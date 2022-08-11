
public class VahenevaLaskuri {

    private int arvo;  // oliomuuttuja joka muistaa laskurin arvon

    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
    }

    public void tulostaArvo() {
        // älä koske tässä olevaan koodiin!
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        // kirjoita tänne metodin toteutus
        if(this.arvo>  0){
            this.arvo = this.arvo-1;
           // System.out.println("arvo: " + this.arvo);
        }
        
    }

    public void nollaa(){
        if(true){
            this.arvo = 0;
        }

    }
}
