
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan?");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println(luku * 86400);


        // toteuta ohjelma tänne

    }
}
