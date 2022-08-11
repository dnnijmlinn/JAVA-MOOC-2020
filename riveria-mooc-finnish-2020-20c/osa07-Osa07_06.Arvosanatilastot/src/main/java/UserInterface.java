import java.util.Scanner;

public class UserInterface {
    private Scanner lukija;
    private ArvosanaTilastot tilastot;
  
    public UserInterface(Scanner lukija, ArvosanaTilastot tilastot){
       this.lukija = lukija;
       this.tilastot = tilastot;
    }

    public void lisaaArvo(int point){
    this.tilastot.lisaa(point);
    }
    
    public double naytaKeskiarvo(){
        return this.tilastot.keskiArvo();
    }
    public double naytaLapKeskiarvo(){
        return this.tilastot.lapiKeskiArvo();
    }
    public double naytaProsentti(){
        return this.tilastot.lapiProsentti();
    }
    public void arvosanaJakauma(){
        this.tilastot.arvJakauma();
    }

    public void start() {
        System.out.println("Syötä yhteispisteet, -1 lopettaa: ");
        while (true) {
            int point = Integer.valueOf(lukija.nextLine());
            if (point == -1) {
                break;
            }
            if (point >= 0 && point <= 100) {
                lisaaArvo(point);
            }
        }
        System.out.println("Pisteiden keskiarvo (kaikki): " + naytaKeskiarvo());

        if (this.tilastot.passingPointsAverage() != 0.0) {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): " + naytaLapKeskiarvo());
        } else {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): -");
        }
        //System.out.println("Pisteiden keskiarvo (hyväksytyt): " + naytaLapKeskiarvo());
        System.out.println("Hyväksymisprosentti: " + naytaProsentti());
        arvosanaJakauma();
    }

    

}