
import java.util.Scanner;

public class Ylinopeussakko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kerro nopeus:");
        int numero = Integer.valueOf(lukija.nextLine());
        if (numero > 120) {
            System.out.println(numero + " Ylinopeussakko!");
        }

        // Toteuta ohjelmasi tähän. 
    }
}
