
import java.util.Scanner;

public class NegatiivistenLukujenMaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int lasku = 0;
        while (true) {
            System.out.println("Syötä luku");
            int numero = Integer.valueOf(lukija.nextLine());
            if (numero == 0) {
                break;
            }
            if (numero < 0) {
                lasku = lasku + 1;
            }
        }
        System.out.println("Negatiivisia lukuja yhteensä " + lasku);
    }
}
