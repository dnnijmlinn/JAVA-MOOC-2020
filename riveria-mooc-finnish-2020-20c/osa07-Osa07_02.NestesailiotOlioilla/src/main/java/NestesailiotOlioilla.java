
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Sailio eka = new Sailio();
        Sailio toka = new Sailio();

        while (true) {
            System.out.println("Ensimmäinen: " + eka);
            System.out.println("Toinen: " + toka);
            String luettu = lukija.nextLine();
            String[] osat = luettu.split(" ");

            if (osat[0].equals("lopeta")) {
                break;
            } else if (osat[0].equals("lisaa")) {
                int amount = Integer.parseInt(osat[1]);
                eka.lisaa(amount);
            } else if (osat[0].equals("siirra")) {
                int amount = Integer.parseInt(osat[1]);

                if (amount > eka.sisalto()) {
                    toka.lisaa(eka.sisalto());
                    eka.poista(amount);
            } else {
                eka.poista(amount);
                toka.lisaa(amount);
                }

            } else if (osat[0].equals("poista")) {
                int amount = Integer.parseInt(osat[1]);
                toka.poista(amount);
            }
        }

    }

}
