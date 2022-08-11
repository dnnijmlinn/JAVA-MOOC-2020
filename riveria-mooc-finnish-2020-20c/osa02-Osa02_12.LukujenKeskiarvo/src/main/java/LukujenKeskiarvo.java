
import java.util.Scanner;

public class LukujenKeskiarvo {

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

        double osuus = 1.0 * numerosum / (numeroyht );
        System.out.println("Lukujen keskiarvo " + osuus );    
    }
}
