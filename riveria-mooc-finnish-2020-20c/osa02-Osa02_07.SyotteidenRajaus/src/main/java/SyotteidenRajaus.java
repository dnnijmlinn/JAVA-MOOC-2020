
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class SyotteidenRajaus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.println("Syötä luku");
            int numero = Integer.valueOf(lukija.nextLine());
            if (numero < 0) {
                System.out.println("Epäkelpo luku");
            } else if ( numero > 0) {
                System.out.println( numero * numero);
            } else {
                break;
            }
        }

        
        
        
    }
}
