
import java.util.Scanner;

//import javax.management.ValueExp;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int posit = 0;
        int positsum = 0;
        int nola = 0;

        while (true) {
            int numero = Integer.valueOf(lukija.nextLine());
            if (numero == 0) {
                //System.out.println("keskiarvon laskeminen ei ole mahdollista" );
                break;
            }
            //if (numero < 0) {
               // System.out.println("keskiarvon laskeminen ei ole mahdollista" );
            //}
            if (numero > 0) {
                posit = posit + 1;
            }
            if (numero > 0) {
                positsum = positsum + numero;
            }
            
        }
        double osuus = 1.0 * positsum / (posit );
        while (true) {
            if (osuus > 0) {
                System.out.println("Lukujen keskiarvo " + osuus );
                break;
            } else {
                System.out.println("keskiarvon laskeminen ei ole mahdollista ");

                break;
            }
        }
        //System.out.println("keskiarvon laskeminen ei ole mahdollista" );

    }
}
