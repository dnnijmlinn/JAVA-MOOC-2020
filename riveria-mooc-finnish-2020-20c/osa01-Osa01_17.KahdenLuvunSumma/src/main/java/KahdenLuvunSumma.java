
import java.util.Scanner;

public class KahdenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku!");
        int eka = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int toka = Integer.valueOf(lukija.nextLine());
        System.out.println( "Lukujen summa on " + (eka + toka));

        // toteuta ohjelma tänne

    }
}
