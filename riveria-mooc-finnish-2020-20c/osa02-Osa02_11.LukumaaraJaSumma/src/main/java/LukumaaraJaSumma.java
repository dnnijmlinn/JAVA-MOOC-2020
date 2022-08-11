
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int numeroyht = 0;
        int numerosum = 0;

        while (true) {
            System.out.println("Syötä luku");
            int numero = Integer.valueOf(lukija.nextLine());
            if (numero == 0) {
                break;
            }
            if (numero == numero) {
                numeroyht = numeroyht + 1;
            }
            if (numero == numero) {
                numerosum = numerosum + numero;
            }
        }
        System.out.println("Lukuja yhteensä " + numeroyht);
        System.out.println("Lukujen summa " + numerosum);
    }
}
