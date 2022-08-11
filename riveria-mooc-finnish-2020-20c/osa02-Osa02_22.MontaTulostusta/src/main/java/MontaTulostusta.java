
import java.util.Scanner;

public class MontaTulostusta {

    public static void main(String[] args) {
        
        // kysy käyttäjältä, montako kertaa teksti tulostetaan
        // kutsu metodia tulostaTeksti while-komennon avulla useita kertoja
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kuinka monta?");
        int numero = Integer.valueOf(lukija.nextLine());
        int eka = 0;
        while (eka < numero) {
            eka = eka +1;
            tulostaTeksti();
            
        }
    }
    
    // HUOM: älä muuta metodin määrittelevää eli seuraavaa riviä!
    // (tässä tehtävässä ei ole vielä tarkoitus laittaa metodille parametria)
    public static void tulostaTeksti() {
        System.out.println("Alussa olivat suo, kuokka ja Java.");
        // kirjoita koodia tähän
    }
}
