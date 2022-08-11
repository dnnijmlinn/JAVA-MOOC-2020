
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku!");
        int ensi = Integer.valueOf(lukija.nextLine());

        System.out.println("Syötä toinen luku!");
        int toinen = Integer.valueOf(lukija.nextLine());

        System.out.println("Syötä kolmas luku!");
        int kolmas = Integer.valueOf(lukija.nextLine());

        System.out.println("Lukujen summa on " + (ensi + toinen + kolmas) );
        
        // toteuta ohjelma tänne

    }
}

