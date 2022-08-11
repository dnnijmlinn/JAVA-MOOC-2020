
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int numero = Integer.valueOf(lukija.nextLine());
        int numero2 = Integer.valueOf(lukija.nextLine());
        if (numero > numero2) {
            System.out.println("Luku " + numero + "on suurempi kuin luku" + numero2 + ".");
        } else if (numero < numero2) {
            System.out.println("Luku " + numero + "on pienempi kuin luku" + numero2 + ".");
        } else {
            System.out.println("Luku " + numero + "on yhtä suuri kuin luku" + numero2 + ".");

        }


    }
}
