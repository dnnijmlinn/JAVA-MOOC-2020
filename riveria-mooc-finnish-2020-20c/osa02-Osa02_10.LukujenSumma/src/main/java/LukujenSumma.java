
import java.util.Scanner;

public class LukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int lasku = 0;
        while (true) {
            System.out.println("Syötä luku");
            int numero = Integer.valueOf(lukija.nextLine());
            if (numero ==0) {
                break;
            }
            if (numero == numero) {
                lasku = lasku + numero;
            }
        }
        System.out.println("Lukujen summa " + lasku);

    }
}
