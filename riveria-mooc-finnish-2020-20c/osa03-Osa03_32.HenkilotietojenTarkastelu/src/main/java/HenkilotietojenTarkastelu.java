
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        String nimi ="z";
        int sur =0;
        int pituus = 0;
        int kes = 0;
        int luk = 0;
        int s =0;
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
        
            String[] palat = luettu.split(",");
            String mjono = palat[0];
            pituus = mjono.length();
           // int pit = palat[1];

            if(pituus>sur){
                sur=pituus;
                nimi=String.valueOf(palat[0]);
            }
            luk++;
            kes = kes + Integer.valueOf(palat[1]);
        }
        System.out.println("Vanhimman nimi: " + nimi );
        System.out.println("Syntymävuosien keskiarvo: " + (1.0 * kes/luk) );


    }
}
