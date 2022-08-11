
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        String a1 = "aleksi" + "tappara";
        String a2 = "elina" + "kissa";
        System.out.print("Anna tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.print("Anna salasana: ");
        String salasana = lukija.nextLine();

        if (a1.equals(tunnus+salasana)){
            System.out.println("Olet kirjautunut järjestelmään");
        } else if (a2.equals(tunnus+salasana)){
            System.out.println("Olet kirjautunut järjestelmään");
        }
        else {
            System.out.println("Virheellinen tunnus tai salasana!");
        }
        
        


    }
}
