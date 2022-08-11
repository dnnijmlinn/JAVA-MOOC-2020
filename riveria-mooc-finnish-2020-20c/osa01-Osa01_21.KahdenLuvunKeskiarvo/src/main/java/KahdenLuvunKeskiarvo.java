
import java.util.Scanner;

public class KahdenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku!");
        int eka = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int toka = Integer.valueOf(lukija.nextLine());

        double tulos = 1.0 * (eka + toka) / 2;
        System.out.println("Syötettyjen lukujen keskiarvo on " + tulos);
        // toteuta ohjelma tänne

    }
}
